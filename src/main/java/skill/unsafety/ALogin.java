package skill.unsafety;

public class ALogin extends Thread{

	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
