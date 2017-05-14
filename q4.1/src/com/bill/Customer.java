package com.bill;

public abstract class Customer {

	public int custId;
	public String custName;
	public long mobileNumber;
	
	public abstract double calculateBill(int minutes);

	public Customer(int custId, String custName, long mobileNumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobileNumber = mobileNumber;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
