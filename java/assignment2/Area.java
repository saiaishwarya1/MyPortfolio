 package cisco.java.assignment2;

public class Area {
int side;
 static double x,y,z,s;
double radius;
long length,breadth;

	public static void main(String[] args) {
		Area a1=new Area(89);
		Area a2=new Area(49,95);
		Area a3=new Area(8.4);
		a1.display_sq();
		a2.display_rec();
		a3.display_circle();
		calculate(89,76,43);
		calculate(76,89);
	}
Area(int s)
{
 side =s;	
}
Area(long l,long b )
{
length=l;
breadth=b;
}
Area(double r)
{
radius=r;	
}
void display_sq()
{
System.out.println("Area of square is : "+side*side);	
}
void display_rec()
{
System.out.println("Area of rectangle is : "+(length*breadth));	
}
void display_circle()
{
System.out.println("Area of circle is : "+(22*radius*radius)/7);	
}
static void calculate(double x, double y, double z){
     s = (x+y+z)/2;
    s = s*(s-x)*(s-y)*(s-z);
	System.out.println("Area of the triangle is " + Math.sqrt(s));	
}
static void calculate(double m, double n){
	System.out.println("Area of the Rhombus is " + (m*n)/2);	
}
}
