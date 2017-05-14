package q4;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student Name) {
		return this.name.compareTo(Name.name);
	}
	
	
	
	
}
