package cisco.java.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("geeksforge*ks","geeksforgeeks"));
		System.out.println(Pattern.matches("g*eksforgeeks","geeksforgeeks"));
		
		//----------Pattern Searching-----------\\
		System.out.println("-----------------PATTERN SEARCHING----------------");
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".s","mk"));
		System.out.println(Pattern.matches("[amn]","abcd"));
		System.out.println(Pattern.matches("[amn]","a"));
		
//---------------------------------QUANTIFIER--------------------------------------\\

		System.out.println("------------------QUANTIFIER-------------------");
		System.out.println("QUANTIFIER ");
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?","aaa"));
		System.out.println(Pattern.matches("[amn]?","aammmnn"));
		System.out.println(Pattern.matches("[amn]?","aazzta"));
		System.out.println(Pattern.matches("[amn]?","am"));
		
		System.out.println("QUANTIFIER ");
		System.out.println(Pattern.matches("[amn]+","a"));
		System.out.println(Pattern.matches("[amn]+","aaa"));
		System.out.println(Pattern.matches("[amn]+","aammmnn"));
		System.out.println(Pattern.matches("[amn]+","aazzta"));
		
		System.out.println("QUANTIFIER ");
		System.out.println(Pattern.matches("[amn]*","ammmna"));
		
		//---------------------------META-CHARACTER-----------------------------\\
		
		System.out.println("META-CHARACTER d");
		System.out.println(Pattern.matches("\\d","abc"));
		System.out.println(Pattern.matches("\\d","1"));
		System.out.println(Pattern.matches("\\d","4443"));
		System.out.println(Pattern.matches("\\d","323abc"));
		
		System.out.println("META-CHARACTER D");
		System.out.println(Pattern.matches("\\D","abc"));
		System.out.println(Pattern.matches("\\D","1"));
		System.out.println(Pattern.matches("\\D","4443"));
		System.out.println(Pattern.matches("\\D","323abc"));
		System.out.println(Pattern.matches("\\D","m"));
		
		System.out.println("META-CHARACTER D*");
		System.out.println(Pattern.matches("\\D*","mak"));
		
		
		
		
	}

}
