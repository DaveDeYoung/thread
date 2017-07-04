package client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("10.20.135.46", 10086);
		String name=JOptionPane.showInputDialog(null,"请输入用户名:");
		new ChatWindow(socket,name);
	}
}

class ChatWindow
{
	Socket s;
	JTextField field;
	JTextArea area;
	String name;
	public ChatWindow(Socket s,String name)
	{
		this.name = name;
		this.s=s;
		JFrame frame=new JFrame(name);
		Container con=frame.getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel p1=new JPanel();
		area=new JTextArea(12,24);
		area.setLineWrap(true);
		JScrollPane jsp=new JScrollPane(area);
		p1.add(jsp);
		
		con.add(p1, BorderLayout.CENTER);
		
		JPanel p2=new JPanel();
		field=new JTextField(18);
		JButton btn=new JButton("发送");
		p2.add(field);
		p2.add(btn);
		
		//创建监听器
		MyListener ml=new MyListener(this,s);
		btn.addActionListener(ml);
		
		//启动客户端线程
		new ClientThread(s, this).start();
		
		con.add(p2, BorderLayout.SOUTH);
		
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
//监听器类
class MyListener implements ActionListener
{
	ChatWindow cw;
	Socket s;
	public MyListener(ChatWindow cw,Socket s)
	{
		this.cw=cw;
		this.s=s;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		System.out.println(str);
		if(str.equals("发送"))
		{
			//获取客户端Socket的输出流
			try
			{
				//获得客户端的输出流
				PrintWriter pw=new PrintWriter(s.getOutputStream());
				pw.println(cw.name+":"+cw.field.getText());//将文本行中的信息打印到客户端的输出流中
				cw.field.setText("");//清空文本行
				pw.flush();
			} catch (IOException e1)
			{
				e1.printStackTrace();
			}
		}
	}
}
//客户端线程，用来处理从服务端接受的信息
class ClientThread extends Thread {
	Socket socket;
	ChatWindow window;
	public ClientThread(Socket socket, ChatWindow window) {
		this.socket = socket;
		this.window = window;
	}
	@Override
	public void run() {
		try {
			//获得客户端的输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true)
			{
				String message=br.readLine();//从服务器中获得的信息
				//将服务器发送过来的信息，输出到文本域中
				window.area.setText(window.area.getText()+"\n"+message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
