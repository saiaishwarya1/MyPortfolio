package cisco.java.programsp2;
import cisco.java.programsp1.N1;
import cisco.java.programsp1.P1;

public class Y {

	public static void main(String[] args) {
		N1 objn=new N1();
		objn.first();
        P1 objp=new P1();
		objp.second();
		X objx=new X();
		objx.third();

	}

}
  class Z{

	public void fourth() {
		N1 objn=new N1();
		objn.first();
        P1 objp=new P1();
		objp.second();
		X objx=new X();
		objx.third();
	}

}

class X
{
   private int ix=89;
    long lx= 26378738L;
    protected float fx=46.98f;
    public char cx='t';
    public void third()
    {
    	System.out.println("Int variable of class X is " + ix);
    	System.out.println("long variable of class X is " + lx);
    	System.out.println("Float variable of class X is " + fx);
    	System.out.println("Char variable of class X is " +cx );
    }
    
   }
