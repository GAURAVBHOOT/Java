package Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
		private ArrayList<String> names=new ArrayList<String>();
		
		
		
		public void setNames(String a) {
			names.add(a);
		}

		public void searchNames(String a) {
			for (int i = 0; i < names.size(); i++) {
				if (this.names.get(i).equals(a)) {
					System.out.println("Name is : "+names.get(i));
				}
				else{
					System.out.println("Not found");
				}
			}
		}
		
		public void searchName(int a) {
			for (int i = 0; i < names.size(); i++) {
				if(i==a){
					System.out.println("Name at index is : "+names.get(i));
				}
				else{
					System.out.println("Name at index Not found");
				}
			}
		}
		
		
		public void printName() {
			Iterator<String> it=names.iterator();
			while (it.hasNext()){
				System.out.println(it.next());
			}

		}
		
				
		public void removeName(String a) {
			for (int j = 0; j < names.size(); j++) {
				if(this.names.get(j).equals(a)){
					names.remove(j);
				}
			}
			
		}
}
