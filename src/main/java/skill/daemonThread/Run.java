package skill.daemonThread;

public class Run {
	
	public static void main(String[] args) {
		try {
			System.out.println(Thread.currentThread().isDaemon());
			MyThread myThread = new MyThread();
			myThread.setDaemon(true);
			myThread.start();
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().isDaemon());
			System.out.println("我离开了 thread对象也不再打印了,也就停止了！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
