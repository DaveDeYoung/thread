package pac;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	public String a = "";
	
	{
		System.out.println("1");
		a = "2";
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
	}
	
	private List<String> list = new ArrayList<String>();
	
	synchronized public void push(){
		try {
			if(list.size()==1){
				this.wait();
			}
			list.add("anyString="+Math.random());
			this.notify();
			System.out.println("push="+list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public String pop(){
		String returnValue = "";
		try {
			if(list.size()==0){
				System.out.println("pop 操作中的"+Thread.currentThread().getName()+"线程是wait状态");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop="+list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}

}
