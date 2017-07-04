package skill.mythread;


public class Run {
	
	public static void main(String[] args) throws InterruptedException {
		CountOperate countOperate = new CountOperate();
		Thread thread = new Thread(countOperate);
		thread.setName("a");
		thread.start();
	}

}
