package concurrent.lockAndsynchronized;

public class ThreadB extends Thread{
	
	private MyObject object;
	
	public ThreadB(MyObject object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		object.methodB();
	}

}
