package Assingment20aug;


public class CustomException2 {

	static void validate(int age) throws SalaryException
	
	 {
		 if(age<2000)
			 throw new SalaryException("you need to work hard");
		  if(age>2100 || age<=5000)
		 {
			 throw new SalaryException("your salary is somehow good");
		 }
		  if(age>5100 || age<=9000)
		 {
			 throw new SalaryException("your salary is very good"); 
		 }
		 else
		 {
			 System.out.println("Invalid) salary"); 
		 }
	 }
		
		

		public static void main(String[] args) {
			try
			{
				validate(2000);
			}
	catch (Exception m)
			{
		System.out.println("Exception occured "+ m.getMessage());
			}
		     System.out.println("rest of the code");
		
		}
		
	}
	class  SalaryException extends Exception
	{
		public SalaryException(String s)
		{
		super(s);
		}
	}

