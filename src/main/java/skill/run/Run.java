package skill.run;

public class Run {
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread("a");
		myThread.start();
//		myThread.run();
	}

}
