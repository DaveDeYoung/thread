package waitandnotify;

public class Test {
	
	public static void main(String[] args) {
		try {
			String lock = new String("");
			MyLock m = new MyLock();
			m.setLock(lock);
			m.start();
			System.out.println("sync上面");
			synchronized (lock) {
				System.out.println("sync第一行");
				lock.notify();
				lock.wait();
				System.out.println("wait下面的代码");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
