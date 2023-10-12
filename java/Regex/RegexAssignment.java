package cisco.java.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssignment {

	public static void main(String[] args) {
		System.out.println("Validate Email");
		System.out.println(Pattern.matches("^[a-zA-Z]+@gmail.com","aishwarya@gmail.com"));
		System.out.println(Pattern.matches("virendra@gmail.com","virendra@gmail.com"));
		System.out.println("Validate Password");
		System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*","A234uotdn"));

	}

}
