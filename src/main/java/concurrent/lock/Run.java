package concurrent.lock;

public class Run {
	
	public static void main(String[] args) {
		HasSelfPrivateNum A = new HasSelfPrivateNum();
		HasSelfPrivateNum B = new HasSelfPrivateNum();
		
		AThread a = new AThread(A);
		a.setPriority(Thread.MIN_PRIORITY);
		BThread b = new BThread(B);
		b.setPriority(Thread.MAX_PRIORITY);
		
		a.start();
		b.start();
	}

}
