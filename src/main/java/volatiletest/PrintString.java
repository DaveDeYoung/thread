package volatiletest;

/**
 * 当线程进入死循环阻塞的时候
 * 
 * @author caiwenyuan
 *
 */
public class PrintString implements Runnable{

	private volatile boolean isContinuePrint = true;
	
	public boolean isContinuePrint(){
		return isContinuePrint;
	}
	
	public void setContinuePrint(boolean isContinuePrint){
		this.isContinuePrint = isContinuePrint;
	}
	
	public void run() {
		printStringMethod();
	}
	
	public void printStringMethod(){
		System.out.println("进入run了");
		while(isContinuePrint == true){
			if(!isContinuePrint){
				System.out.println(1);
			}
		}
		System.out.println("线程被停止了!");
	}
}
