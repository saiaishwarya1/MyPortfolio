package cisco.java.Oops;

public abstract class AbstractDemo {
private String name="abc";
public static void main (String[]args)
{
	AbstractDemo ob=new BasicExample();
	ob.anotherMethod();
	ob.myMethod();
}
AbstractDemo()
{
System.out.println("inside the abstract class..");	
}
public void myMethod()
{
System.out.println("Hello"+name);
}
abstract public void anotherMethod();
}
 class BasicExample extends AbstractDemo
{
BasicExample()
{
super();
System.out.println("Inside child class");
}
public void anotherMethod() {
	
	System.out.println("Abstract method : ");
}
}


