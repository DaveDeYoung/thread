package skill.run;

public class MyThread extends Thread{
	
	public MyThread(String name) {
		this.setName(name);
		System.out.println(Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
