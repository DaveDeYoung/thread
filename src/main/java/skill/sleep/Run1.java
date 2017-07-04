package skill.sleep;

public class Run1 {
	
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		long start = System.currentTimeMillis();
		System.out.println("begin ="+start);
		myThread1.run();
		System.out.println("end ="+(System.currentTimeMillis()-start));
		
//		MyThread2 myThread2 = new MyThread2();
//		long start = System.currentTimeMillis();
//		System.out.println("begin ="+start);
//		myThread2.start();
//		long end = System.currentTimeMillis();
//		System.out.println("end ="+end +" takes="+(end-start));
	}

}