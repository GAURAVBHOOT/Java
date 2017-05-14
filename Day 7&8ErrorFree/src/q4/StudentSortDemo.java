package q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentSortDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> a=new ArrayList<Student>();
		
		a.add(new Student(1, "ABC"));
		a.add(new Student(2, "XYZ"));
		a.add(new Student(3, "PQR"));
		a.add(new Student(4, "MNO"));
		a.add(new Student(5, "KLM"));
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Unsorted output : "+a.get(i));
		}
		
		System.out.println("*************************************");
		Collections.sort(a);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Sorted output : "+a.get(i));
		}
		
	}

}
