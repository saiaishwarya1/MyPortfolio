package cisco.java.method;

public class Methodoverload {
  public void area(int b,int h)
  {System.out.println("Area of traingle : "+(0.5*b*h));
  }
  public void area(int r)
  {System.out.println("Area of circle: "+(3.14*r*r));
  }
  public void area(float g,int c)
  {System.out.println("printing the value : "+g+ "--- " +c);
  }
  public void area(int h,float g, char m)
  {System.out.println("printing the value h: "+h+ "---g  "+g+ "---m"+m);
  }
  
  
	public static void main(String[] args) {
		Methodoverload ob=new Methodoverload();
		ob.area(10.0f,12);
		ob.area(5);
		

	}

}
