/**
 * 
 */
package skill.thread;

/**
 * @author caiwenyuan
 *
 */
public class Run {


	public static void main(String[] args) throws InterruptedException {
//		MyThread a = new MyThread("A");
//		MyThread b = new MyThread("B");
//		MyThread c = new MyThread("C");
//		a.start();
//		b.start();
//		c.start();
		
		
		//共享数据  五个线程
		MyShareThread mythread = new MyShareThread();
		
		Thread a = new Thread(mythread,"A");
		Thread b = new Thread(mythread,"B");
		Thread c = new Thread(mythread,"C");
		Thread d = new Thread(mythread,"D");
		Thread e = new Thread(mythread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		
	}

}
