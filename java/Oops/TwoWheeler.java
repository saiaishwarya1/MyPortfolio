package cisco.java.Oops;

 class TwoWheeler extends Vehicle {
 int speed;
 int number_of_tyres;
 long distance;
void run()
{
System.out.println("Two wheeler is running using run method");	
}
void stop()
{
	System.out.println("Two wheeler has stopped running using stop method");	
}
TwoWheeler()
{
System.out.println("Inside TwoWheeler's constructor");	
}
void display(int speed,long distance,int number_of_tyres)
{
	this.speed=speed;
	this.distance=distance;
	this.number_of_tyres=number_of_tyres;
	System.out.println("Speed of 2 wheeler is "+speed);
	System.out.println("Distance travelled by 2 wheeler is "+distance);
	System.out.println("Number of tyres of 2 wheeler are "+number_of_tyres);
	System.out.println("Speed of parent vehicle is "+super.speed);
	System.out.println("Distance travelled by parent vehicle "+super.distance);
	
	
	
}
}
