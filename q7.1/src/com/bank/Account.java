package com.bank;

public class Account implements Comparable<Account>  {
	private String accountNumber;
	private double accountBalance;
	private String chequeBookStatus;
	
	
	public Account(String accountNumber, double accountBalance,
			String chequeBookStatus) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.chequeBookStatus = chequeBookStatus;
	}
	
	


	public Account() {
		super();
	}




	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		if (accountNumber.substring(0, 3).equals("ACC")) {
			this.accountNumber = accountNumber;
		}
		else{
			try {
				throw new InvalidDataException("Invalid data");
			} catch (InvalidDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		if (accountBalance>=100) {
			this.accountBalance = accountBalance;	
		}
		else{
			try {
				throw new InvalidDataException("Invalid data");
			} catch (InvalidDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public String getChequeBookStatus() {
		return chequeBookStatus;
	}


	public void setChequeBookStatus(String chequeBookStatus) {
		if (chequeBookStatus.equals("Yes")||chequeBookStatus.equals("No")) {
			this.chequeBookStatus = chequeBookStatus;
		}
		else{
			try {
				throw new InvalidDataException("Invalid data");
			} catch (InvalidDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	@Override
	public int compareTo(Account o) {
		return this.accountNumber.compareTo(o.accountNumber);
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + ", chequeBookStatus=" + chequeBookStatus
				+ "]";
	}
	
	
	
	
	
	
}
