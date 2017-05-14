package com.bill;

public class RegularCustomer extends Customer {

	public int billNo;
	public float billAmount;
	
	
	
	public RegularCustomer(int custId, String custName, long mobileNumber,
			int billNo) {
		super(custId, custName, mobileNumber);
		this.billNo = billNo;
		
	}



	public int getBillNo() {
		return billNo;
	}



	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}



	public float getBillAmount() {
		return billAmount;
	}



	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}



	@Override
	public double calculateBill(int minutes) {
		if(minutes<=30){
			billAmount=(minutes*3)/2;
		}
		else {
			billAmount=minutes*1;
		}
		return billAmount;
	}



	@Override
	public String toString() {
		return "RegularCustomer [billNo=" + billNo + ", billAmount="
				+ billAmount + ", custId=" + custId + ", custName=" + custName
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	
}
