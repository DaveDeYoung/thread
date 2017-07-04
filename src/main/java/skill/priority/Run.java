
package skill.priority;

public class Run {
	
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			MyThread1 myThread1 = new MyThread1();
//			myThread1.setPriority(1);
//			myThread1.start();
//			MyThread2 myThread2 = new MyThread2();
//			myThread2.setPriority(10);
//			myThread2.start();
//		}
		try {
			ThreadA a = new ThreadA();
			a.setPriority(Thread.MAX_PRIORITY);
			a.start();
			ThreadA b = new ThreadA();
			b.start();
			b.setPriority(Thread.MIN_PRIORITY);
			Thread.sleep(10000);
			a.stop();
			b.stop();
			System.out.println("a="+a.getCount()+" name="+a.getName());
			System.out.println("b="+b.getCount()+" name="+b.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
