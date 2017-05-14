package Q3;


public class Customer  {
	
	private String custNo;
	private String custName;
	private String category;
	
	
	public Customer(String custNo, String custName, String category)  {
		
		try{
		if (custNo.charAt(0)=='C'||custNo.charAt(0)=='c'){
			if (custName.length()>=4){
				if(category.equals("Platinum")||category.equals("Gold")||category.equals("Silver")){
					this.custNo = custNo;
					this.custName = custName;
					this.category = category;
				}
			}
		
			
		
		}
		else
		{
			throw new InvalidInputException("invalid input");
			
		}
		}
		catch(InvalidInputException e) {
			e.printStackTrace();
		}
		
	}


	public String getCustNo() {
		return custNo;
	}


	public String getCustName() {
		return custName;
	}


	public String getCategory() {
		return category;
	}
	
	
	

	
	

}
