package com.techm.bank;

public class DriverMain {

	public static void main(String[] args) {
		
		SavingAccount sn=new SavingAccount("Biksa",100000,"Pune");
		SavingAccount sn1=new SavingAccount("Biksa1",100000,"Mumbai");
		SavingAccount sn2=new SavingAccount("Biksa2",100000,"Hyd");
		SavingAccount sn6=new SavingAccount("Biksa3",100000,"Chennai");
		CurrentAccount sn3=new CurrentAccount("Parsa",10000000,"Zhingalala1");
		CurrentAccount sn4=new CurrentAccount("Parsa1",10000000,"Zhingalala2");
		CurrentAccount sn5=new CurrentAccount("Parsa2",10000000,"Zhingalala3");
		CurrentAccount sn7=new CurrentAccount("Parsa3",10000000,"Zhingalala4");
		
		System.out.println(sn.getAccID()+" "+sn.getAccName()+" "+sn.getAmount()+" "+sn.getBranch());
		System.out.println(sn1.getAccID()+" "+sn1.getAccName()+" "+sn1.getAmount()+" "+sn1.getBranch());
		System.out.println(sn2.getAccID()+" "+sn2.getAccName()+" "+sn2.getAmount()+" "+sn2.getBranch());
		System.out.println(sn6.getAccID()+" "+sn6.getAccName()+" "+sn6.getAmount()+" "+sn6.getBranch());
		System.out.println("-----------------------------------------------");
		System.out.println(sn3.getAccID()+" "+sn3.getAccName()+" "+sn3.getAmount()+" "+sn3.getSpecialFacility());
		System.out.println(sn4.getAccID()+" "+sn4.getAccName()+" "+sn4.getAmount()+" "+sn4.getSpecialFacility());
		System.out.println(sn5.getAccID()+" "+sn5.getAccName()+" "+sn5.getAmount()+" "+sn5.getSpecialFacility());
		System.out.println(sn7.getAccID()+" "+sn7.getAccName()+" "+sn7.getAmount()+" "+sn7.getSpecialFacility());
	
	}

}
