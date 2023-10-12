package Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Coll {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("a");
		hs.add("p");
		hs.add("all");
		hs.add("good");
		hs.add("four");
		hs.add("name");
		hs.add("m");
		hs.add("z");
		
		System.out.println("size of linkedhashset is "+hs.size());
		System.out.println("use of contains method linkedhashset "+hs.contains("queen"));
		System.out.println("use of remove method linkedhashset "+hs.remove("four"));
		System.out.println("use of add method linkedhashset "+hs.add("added"));
		System.out.println("use of Empty method linkedhashset "+hs.isEmpty());
		hs.clear();
		
		System.out.println("get class "+hs.getClass());
		System.out.println(" linkedhashset is "+hs.isEmpty());
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Spain");
		ts.add("India");
		ts.add("Zimbabwe");
		ts.add("France");
		ts.add("China");
		
		System.out.println("size of Treeset is "+ts.size());
		System.out.println("use of contains method in Treeset "+ts.contains("queen"));
		System.out.println("use of remove method in Treeset "+ts.remove("four"));
		System.out.println("use of add method in Treeset is "+ts.add("added"));
		System.out.println("use of Empty method in Treeset "+ts.isEmpty());
		ts.clear();
		
		System.out.println("get class "+ts.getClass());
		System.out.println("Treeset is "+ts.isEmpty());
		
		
		HashSet<String> nhs=new HashSet<String>();
		nhs.add("Pineapple");
		nhs.add("Blueberry");
		nhs.add("Orange");
		nhs.add("Apple");
		
		
		System.out.println("size of hashset is "+nhs.size());
		System.out.println("use of contains method hashset"+nhs.contains("Pear"));
		System.out.println("use of remove method hashset  "+nhs.remove("Apple"));
		System.out.println("size of hashset is "+nhs.add("Pear"));
		System.out.println("size of hashset is "+nhs.isEmpty());
		nhs.clear();
		
		System.out.println("get class "+nhs.getClass());
		System.out.println(" hashset is "+nhs.isEmpty());
		
		
	}

}
