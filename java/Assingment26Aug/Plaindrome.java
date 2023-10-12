package Assingment26Aug;

import java.util.Scanner;
public class Plaindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String a="";
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+=s.charAt(i);
		}
		if(s.contentEquals(a))
		{
			System.out.println(s+" Is plaindrome.");
		}
		
		else
		{System.out.println(s+" Is not plaindrome.");}
	}

}
