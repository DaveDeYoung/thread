package volatiletest;

public class Run {
	
	public static void main(String[] args) throws InterruptedException {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();
		Thread.sleep(1000);
		System.out.println("我要停止它!stopThread="
					+Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}