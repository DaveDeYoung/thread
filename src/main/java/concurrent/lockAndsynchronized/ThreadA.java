package concurrent.lockAndsynchronized;

public class ThreadA extends Thread {
	
	private MyObject object;
	
	public ThreadA(MyObject object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		object.methodA();
	}

}
