package cisco.java.assignment3;

public class Students {

	public static void main(String[] args) {
		 Students s1=new  Students("Maya",12,'A','F',30,40,45);
		 Students s2=new  Students("Bala",10,'B','M',38,40);
		 Students s3=new  Students("Zayn",11,'D','M',36,47);
		 Students s4=new  Students("Alia",12,'C','F',35,44,43);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
	String Name;
	int Age;
	char Sec;
	char Gender;
	float sub1; 
	float sub2;
	float sub3;
	float totalMarks;
	float percentage;
	 Students(String n,int a,char s,char g,float m1,float m2,float m3)
	{
    Name=n;		
	Age=a;
	Sec=s;
    Gender=g;
    sub1=m1;
	sub2=m2;
	sub3=m3;
	}
	 Students(String n,int a,char s,char g,float m2,float m3)
	{
	Name=n;	
	Age=a;
	Sec=s;
    Gender=g; 
	sub2=m2;
	sub3=m3;
	}
	void display()
	{
		System.out.println(Name+"    "+Age+"    "+Sec+"    "+Gender+"    "+(totalMarks=sub1+sub2+sub3)+"    "+(percentage=totalMarks/300*100));
	}
	
	

}
