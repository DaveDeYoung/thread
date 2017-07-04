package concurrent.lockAndsynchronized;

/**
 * A线程先持有object对象的Lock锁,B线程可以以异步的方式
 * 调用object对象中的非sychronized类型方法
 * A线程先持有object对象的Lock锁,B线程如果在这时调用object对象中
 * sychronizd类型的方法则需等待,也就是同步
 * 
 * sychronized 持有的是对象锁
 * @author caiwenyuan
 */
public class Run {
	
	public static void main(String[] args) {
		MyObject myObject = new MyObject();
		
		ThreadA a = new ThreadA(myObject);
		ThreadB b = new ThreadB(myObject);
		a.setName("a");
		b.setName("b");
		
		a.start();
		b.start();
	}

}
