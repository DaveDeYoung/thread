package skill.priority;

public class ThreadA extends Thread {
	
	private int count = 0;
	
	
	@Override
	public void run() {
		while(true){
			count++;
		}
	}

	public int getCount() {
		return count;
	}


}
