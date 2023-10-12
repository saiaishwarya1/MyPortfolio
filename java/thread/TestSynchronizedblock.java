package cisco.java.thread;

class Table

{
  void printTable(int n)
  {
	  System.out.println("I am into this printTable method");
	  
	  synchronized(this)
	  {
		  for(int i=1;i<=5;i++)
		    
			  {
			  System.out.println(n*i);
			  
		  try
		  {
			  Thread.sleep(400);
		  }
		  catch(Exception e)
		  {System.out.println(e);}
	  }
    }
  }
} 
  class MyThread1 extends Thread
  {
	  Table t;
	  MyThread1(Table t)
	  {this.t=t;}
	  public void run()
	  {
		  System.out.println("Into the MyThread1 run() method");
		  t.printTable(5);
	  }
  }
  
  class MyThread2 extends Thread
  {
	  Table t;
	  MyThread2(Table t)
	  {this.t=t;}
	  public void run()
	  {
		  System.out.println("Into the MyThread1 run() method");
		  t.printTable(5);
	  }
  }
  
  
public class TestSynchronizedblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
