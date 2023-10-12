package cisco.java.Oops;

public class Vehicle {
	int speed=7;
	long distance=87654;
	int a,b,x;
	float l,q;
	char c;
	void run()
	{
		System.out.println("Vehicle is running");
	}
	void stop()
	{
	 System.out.println("Vehicle has stopped");
	}
	public void fuel(int a)
	{
		this.a=a;
		
		System.out.println("Inside 1st fuel method and variable is "+a);
	}
	public void fuel(float l,float q)
	{
		this.l=l;
		this.q=q;
		System.out.println(" Inside second fuel method and variables are "+l+" and "+q);
	}
	public void fuel(int b,char c)
	{
		System.out.println("Inside third fuel method and variables are "+b+" and "+c);
	}
	Vehicle()
	{
		System.out.println("Inside first constructor");
	}
	Vehicle(int x)
	{
		this.x=x;
		System.out.println("Inside Second constructor and variable is "+x);
	}
	public static void main(String[] args) {
		Vehicle ob =new Vehicle();
		ob.run();
		ob.stop();
		ob.fuel(5);
		ob.fuel(3,'h');
		ob.fuel(2.9f,7.4f);
		Vehicle ob1= new Vehicle();
		Vehicle ob2= new Vehicle(89);
		TwoWheeler ob3= new TwoWheeler();
		ob3.run();
		ob3.stop();
		ob3.display(98,9000,2);
		ThreeWheeler ob4= new ThreeWheeler();
		ob4.run();
		ob4.stop();
		ob4.display(78,8000,3);
		FourWheeler ob5= new FourWheeler();
		ob5.run();
		ob5.stop();
		ob5.display(99,10000,4);
		EightWheeler ob6= new EightWheeler();
		ob6.run();
		ob6.stop();
		ob6.display(97,9000,8);
		
	    
		
		
		
		
	}

}
