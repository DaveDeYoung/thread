package threadblock;

public class Run {
	
	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 myThread1 = new MyThread1(task);
		MyThread2 myThread2 = new MyThread2(task);
		myThread1.setName("a");
		myThread2.setName("b");
		myThread1.start();
		myThread2.start();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime2<CommonUtils.beginTime1){
			beginTime =  CommonUtils.beginTime2;
		}
		
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime2>CommonUtils.endTime1){
			endTime =  CommonUtils.endTime2;
		}
		
		System.out.println("耗时:"+(endTime-beginTime)/1000);
	}

}
