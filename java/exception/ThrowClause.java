package cisco.java.exception;
import  java.util.Scanner;
public class ThrowClause {
	
 static int add(int num1,int num2)
 {
	 if(num1> 900)
{
throw new ArithmeticException("Num 1 is greater than 900 and hence Exception is thrown");
}else
{
	System.out.println("Both parameters are correct");
}
 return num1+num2;
}
	 
	public static void main(String[] args) {
		
		int result =0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 =sc.nextInt();
		
		System.out.println("Enter number 1 : ");
		int num2 =sc.nextInt();
		
		try
		{
			result=add(num1,num2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
			
		}
		System.out.println("Result is : "+result);
	}

}
