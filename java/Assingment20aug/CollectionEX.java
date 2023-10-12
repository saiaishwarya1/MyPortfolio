package Assingment20aug;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class CollectionEX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashSet l1=new LinkedHashSet();
		LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
		
		l1.add(56);
		l1.add(7.8);
		l1.add(75);
		l1.add(4.5);
		l1.add('i');
		l1.add('k');
		l1.add("True");
		System.out.println("Linked Hashset l1 is "+l1);
		
		
		System.out.println("Enter number 1 to 8");
		
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		l2.add(sc.nextInt());
		System.out.println("Linked Hashset l2 is "+l2);
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Java");
		ts.add("C");
		ts.add("Ruby");
		ts.add("Angular");
		ts.add("Python");
		ts.add("HTML");
		
		System.out.println("size of Treeset is "+ts.remove("C"));
		System.out.println("size of Treeset is "+ts.remove("HTML"));
		System.out.println(""+ts.add("C"));
		System.out.println(""+ts.add("HTML"));
		System.out.println(""+ts.removeAll(ts));
		

	}

}
