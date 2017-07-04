package concurrent.lock;

public class AThread extends Thread {
	
	private HasSelfPrivateNum hasSelfPrivateNum;
	
	
	public AThread(HasSelfPrivateNum hasSelfPrivateNum) {
		this.hasSelfPrivateNum = hasSelfPrivateNum;
	}
	
	
	@Override
	public void run() {
		hasSelfPrivateNum.addI("a");
	}

}
