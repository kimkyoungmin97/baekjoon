package pratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pratice_split {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
		String str = "as10b20c300d";
		Pattern pattern = Pattern.compile("[a-zA-Z]+|[a-zA-Z]|\\d+");
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
		    System.out.println(matcher.group());
		}
		
		
	}

}
