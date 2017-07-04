package skill.sleep;

public class MyThread2 extends Thread {
	
	@Override
	public void run() {
		try {
			System.out.println("id="+this.getId());
			long start = System.currentTimeMillis();
			System.out.println("run threadName="
						+this.currentThread().getName() +
							" begin ="+ start);
			Thread.sleep(2000);
			long end = System.currentTimeMillis();
			System.out.println("run threadName="
					+this.currentThread().getName() +
						" end ="+end +" takes="+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
