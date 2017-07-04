package token;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TokenTest {
	
	private static void tokenizeUsingScanner(String string,String regex) {
		Scanner scanner = new Scanner(string);
		scanner.useDelimiter(regex);
		List<String> matches = new ArrayList<String>();
		while(scanner.hasNext()){
			matches.add(scanner.next());
		}
		System.out.println(matches);
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		String string = "1;2;||3;4;";
		tokenizeUsingScanner(string, "4");
	}

}
