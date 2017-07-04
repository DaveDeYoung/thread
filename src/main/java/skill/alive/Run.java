
package skill.alive;

public class Run {
	
	public static void main(String[] args) throws InterruptedException {
//		MyThread myThread = new MyThread();
//		System.out.println("begin =="+myThread.isAlive());
//		myThread.start();
//		System.out.println("end =="+myThread.isAlive());
		CountOperate countOperate = new CountOperate();
		Thread t1 = new Thread(countOperate);
		System.out.println("main begin t1 isAlive = "+t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive = "+t1.isAlive());
	}

}
