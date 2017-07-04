package skill.testThrowLock;

public class Run {
	
	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread myThread = new MyThread(object);
			myThread.start();
			Thread.sleep(500);
			myThread.interrupt();
			System.out.println(object.getUsername()+"   "+object.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
