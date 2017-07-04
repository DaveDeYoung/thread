package skill.unsafety;

public class BLogin extends Thread{

	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
