package skill.daemonThread;

public class MyThread extends Thread {
	
	private int i;
	
	@Override
	public void run() {
		while(true){
			try {
				i++;
				System.out.println("i="+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
