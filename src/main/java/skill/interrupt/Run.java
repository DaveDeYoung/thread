package skill.interrupt;

public class Run {
	
	
	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(2000);
			myThread.interrupt();
			//Thread.currentThread().interrupt();
//			System.out.println("是否停止1？ ="+myThread.isInterrupted());
//			System.out.println("是否停止2？ ="+myThread.isInterrupted());
//			
//			System.out.println("是否停止1？ ="+Thread.interrupted());
//			System.out.println("是否停止2？ ="+Thread.interrupted());
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("system end");
//		Thread.currentThread().interrupt();
//		System.out.println("是否停止1？ ="+Thread.interrupted());
//		System.out.println("是否停止2？ ="+Thread.interrupted());
	}

}
