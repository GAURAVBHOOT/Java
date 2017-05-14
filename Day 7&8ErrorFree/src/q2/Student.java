package q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	
	private Map<String, String> a=new HashMap<String, String>();
	
	public void setNames(String b,String c) {
		a.put(b, c);
	}
	
	public void printNames() {
		Set<Entry<String, String>> s=a.entrySet();
		for (Entry<String, String> i : s) {
			System.out.println(i);
		}
		
	}
	
	public void printNamesKeySet() {
		Set<String> i=a.keySet();
		for (String s : i) {
			System.out.println(a.get(s) );
		}
		
	}
	
	public void getNames(String key) {
		System.out.println("Name at "+key+" is"+a.get(key));
		
	}
	
	public void sizeHash() {
		System.out.println("Size of hash map"+a.size());
	}
	
	public void remove(String key) {
		a.remove(key);
		System.out.println("Removed "+key);
		Set<Entry<String, String>> s=a.entrySet();
		for (Entry<String, String> i : s) {
			System.out.println(i);
		}
		
	}
}
