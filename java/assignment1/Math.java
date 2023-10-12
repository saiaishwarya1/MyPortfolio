package cisco.java.assignment1;

public class Math {
	static int resultOfSum=0;
	static float areaCircle=0;
	static int areaRect=0;
int calculate(int a,int b,int f)
{
	resultOfSum=a+b+f;
	return resultOfSum;
	}
	
float calculate(int r)
{
	 areaCircle=(22*r*r)/7;
	 return  areaCircle;	
}
int calculate(int c, int d)
{
	areaRect =c*d ;
	return areaRect;
}

public static void main(String[] args) {
//Using Method overloading
Math ob=new Math();
ob.calculate(89, 73,56);
ob.calculate(19);
ob.calculate(42, 91);
System.out.println("Sum of two numbers is : "+ resultOfSum);
System.out.println("Area of circle is : "+ areaCircle );
System.out.println("Area of Rectangle is : "+ areaRect );
}
}
