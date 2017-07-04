package skill.thread;

public class MyShareThread extends Thread {
	
	private int count = 10;
	

	public synchronized void run() {
		count--;
		System.out.println(Thread.currentThread().getName()+":"+count);
	}

}
