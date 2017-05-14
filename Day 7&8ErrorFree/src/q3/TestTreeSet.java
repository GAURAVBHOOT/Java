package q3;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> name=new TreeSet<String>();
		
		name.add("Pineapple");
		name.add("Apple");
		name.add("Grapes");
		name.add("Banana");
		name.add("Apple");
		
		Iterator<String> it=name.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("***************************");
		
		System.out.println("First : "+name.first());
		
		System.out.println("Last : "+name.last());
		
		System.out.println("****************************");

		System.out.println("Size : "+name.size());
		
		System.out.println("****************************");
		
		name.remove("Pineapple");
		
		System.out.println("New size : "+name.size());
		
		System.out.println("****************************");
		
		
			
	}

}
