package cisco.java.exception;

public class NestedTryDemo {

	public static void main(String[] args) {
		try
		{
			checkException();
		}
		
     finally
     {System.out.println("Finally outside method");
     }
	}
public static void checkException()
{
try
{
int res=3/10;	
}
catch (ArithmeticException e)
{
	 System.out.println("ArithmrticException");	
}
finally
{ System.out.println("finally inside method");}
}
}
