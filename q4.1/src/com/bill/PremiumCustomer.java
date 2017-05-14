package com.bill;

public class PremiumCustomer extends Customer {

	
	public int billNo;
	public float billAmount;
	
	
	public PremiumCustomer(int custId, String custName, long mobileNumber,
			int billNo) {
		super(custId, custName, mobileNumber);
		this.billNo = billNo;
		
	}


	
	@Override
	public double calculateBill(int minutes) {
		if(minutes <= 30){
			billAmount=minutes*1;
		}
		else {
			billAmount=(minutes*1)/2;
		}
		return billAmount;
	}



	@Override
	public String toString() {
		return "PremiumCustomer [billNo=" + billNo + ", billAmount="
				+ billAmount + ", custId=" + custId + ", custName=" + custName
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}

