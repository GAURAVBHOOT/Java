package q5;

import java.util.Comparator;

public class comparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		if (a.getRollNo()>b.getRollNo()) {
			return 1;
		} else if(a.getRollNo()<b.getRollNo()) {
			return -1;
		}
		else{
			return 0;
		}
	}

}
