package cisco.java.Oops;


	abstract class Bike {
		Bike()
		{
			System.out.println("bike is created");
		}
		abstract void run1();
		 void changeGear()
		{
			System.out.println("gear changed");
		}
	}
	abstract class Honda extends Bike
	{
	Honda()
	{
	System.out.println("honda is  created");	
	}
	abstract void run();
	abstract void run1();
	}
	class Hello extends Honda
	{
	void run()
	{
		System.out.println("running safely");	
		
	}
	void run1()
	{
		System.out.println("inside run 1 method");	
		
	}
	}
	public class AbstractExample{
	public static void main(String[] args) {
		Honda k=new Hello();
		k.run();
		k.run1();
		k.changeGear();
	}

}
