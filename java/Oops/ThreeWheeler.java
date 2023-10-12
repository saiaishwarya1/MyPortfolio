package cisco.java.Oops;

public class ThreeWheeler extends Vehicle {
	int speed;
	 int number_of_tyres;
	 long distance;
	void run()
	{
	System.out.println("Three wheeler is running using run method");	
	}
	void stop()
	{
		System.out.println("Three wheeler has stopped running using stop method");	
	}
	ThreeWheeler()
	{
	System.out.println("Inside ThreeWheeler's constructor");	
	}
	void display(int speed,long distance,int number_of_tyres)
	{
		this.speed=speed;
		this.distance=distance;
		this.number_of_tyres=number_of_tyres;
		System.out.println("Speed of 3 wheeler is "+speed);
		System.out.println("Distance travelled by 3 wheeler is "+distance);
		System.out.println("Number of tyres of 3 wheeler are "+number_of_tyres);
		System.out.println("Speed of parent vehicle is "+super.speed);
		System.out.println("Distance travelled by parent vehicle "+super.distance);
		}
}
