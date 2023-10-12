
	import java.io.*;
	import java.util.*;

	public class ProjectAsh throws In {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Virtual keys to files");
			System.out.println("Developer's name : Aishwarya Shinde");
			
		 ProjectAsh ob=new ProjectAsh();
			
		 char ch;
	     do{
	        
	    	 System.out.println("Press 0 to display all the files");
	         System.out.println("Press 1 to add a file");
	         System.out.println("Press 2 to delete a file");
	         System.out.println("Press 3 to search a file");
	         System.out.println("Press 4 to exit");
	         
	         int choice = sc.nextInt();
	         switch (choice)
	         {
	         case 0:
	        	 try
	     		{
	     		List<String> al= new ArrayList<>();
	     		File f=new File("D:\\Phase1");
	     		String arr []=f.list();
	     		al=Arrays.asList(arr);
	     		Collections.sort(al);
	     		
	     		for(String string : al)
	     		{System.out.println(string);}
	     		}
	     		catch(Exception e)
	     		{}
	        	 break;
	        	 
	         case 1 : 
	             System.out.println("Enter name of file you want to add");
	             try
	             {
	                 ob.add( sc.next() );
	             }
	             catch(Exception e)
	             {
	                 System.out.println("Error : " +e.getMessage());
	             }                         
	             break;                         
	         case 2 :
	        	 System.out.println("Enter name of file you want to delete");
	             try
	             {
	            	 ob.delete( sc.next() );
	             }
	             catch(Exception e)
	             {
	                 System.out.println("Error : " +e.getMessage());
	             }
	             break;                         
	         case 3 : 
	        	 System.out.println("Enter name of file you are looking for");
	             try
	             {
	            	ob.search( sc.next() );
	             }
	             catch(Exception e)
	             {
	                 System.out.println("Error : "+e.getMessage());
	             }
	             break; 
	             
	         case 4:
	        	   System.out.println("------------THANK YOU--------------");
	        	   sc.close();
	        	   System.exit(0);
	        
	             break;
	         default : System.out.println("Wrong Entry \n ");
	         break;
	         }
	        
	                    
	         System.out.println("\nDo you want to continue (Type y or n) \n");
	         ch = sc.next().charAt(0);

	     } while (ch == 'Y'|| ch == 'y');                                                     
		}
		
		//method for adding a file 
		public void add(String s1)
		{    
			try
			{
			File f1=new File("D:\\Phase1\\"+s1);
			f1.createNewFile();
			System.out.println(s1+" is created.");
		     }
			catch(Exception e)
			{}
		}
		
	    //method for deleting a file
		public void delete(String s2) throws InvalidFileNameException
		{
			File f2 =new File("D:\\Phase1\\"+s2);
			if(f2.exists())
			{   f2.delete();
				System.out.println(s2+" is deleted");}
			else
			{
				throw new InvalidFileNameException("File not found");
			}
		}
		
		//method for searching a file
		public void search(String s3)
		{
			File f3=new File("D:\\Phase1");
			String a[]=f3.list();
			int m = 0;
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i].equals(s3))
				{
					m=i;
				}
			}
				if(m!=0)
				{System.out.println(s3+" is on number "+m);}
				else
					System.out.println(s3+" Not found");	
			
			
		}
		
		       
		
	}

	class InvalidFileNameException extends Exception
	{
		InvalidFileNameException(String s)
		{super(s);}

		}



}
