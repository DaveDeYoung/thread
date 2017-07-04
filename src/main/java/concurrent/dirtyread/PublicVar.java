package concurrent.dirtyread;

public class PublicVar {
	
	public String username = "A";
	public String password = "AA";
	
	synchronized public void setValue(String username,String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println(Thread.currentThread().getName()
					+" username="+username+" password="+password);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
