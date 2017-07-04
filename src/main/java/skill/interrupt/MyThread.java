package skill.interrupt;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if(MyThread.interrupted()){
					System.out.println("已结是停止状态了！我要退出了！");
					throw new InterruptedException();
				}
				System.out.println("i="+(i+1));
			}
			System.out.println("我在for下面");
		} catch (Exception e) {
			System.out.println("进入MyThread.java类 run方法中的catch了！");
			e.printStackTrace();
		}
	}

}
