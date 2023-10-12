package cisco.java.Oops;
abstract class MNC
{
	 abstract void Mnc1();
	 
	 abstract void Mnc2();
	 
	 MNC()
	 {
		 
		 System.out.println("Inside MNC constructor");
	 }
	 
	 void MyMnc()
	 {
		 System.out.println("Inside simple method");
	 }
	
}

 abstract class Infosys extends MNC
 {
	 
	 abstract void Mnc1();
	 
	 
	 
 }
 
 class Hi extends Infosys 
 {

	
	void Mnc1() 
	{
		System.out.println(" Inside Hello class implementing abstract method 1");
		
	}


	void Mnc2() 
	{
		System.out.println("Inside Hello class implementing abstract method 2");
	
	}
	 
	void Company()
	{
		System.out.println("My Company");
	}
 }


public class Assingment {

	public static void main(String[] args) {
		Infosys ob = new Hi();
		ob.Mnc1();
		ob.Mnc2();
		ob.MyMnc();
		Hi ob1 = new Hi();
		ob1.Company();
	}

}
