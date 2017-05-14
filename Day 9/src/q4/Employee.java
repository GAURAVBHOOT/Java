package q4;

public class Employee {
	
	private int empNo;
	private String empName;
	private int empBasic;
	
	public Employee(int empNo, String empName, int empBasic) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empBasic = empBasic;
	}
	
	

	public Employee() {
		super();
	}



	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpBasic() {
		return empBasic;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName
				+ ", empBasic=" + empBasic + "]";
	}
	
	

}
