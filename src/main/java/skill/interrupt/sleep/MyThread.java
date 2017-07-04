package skill.interrupt.sleep;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			for (int i = 0; i < 1000000; i++) {
				System.out.println("i="+(i+1));
			}
			Thread.sleep(2000000);
			System.out.println("run end");
		} catch (Exception e) {
			System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}
	

}
