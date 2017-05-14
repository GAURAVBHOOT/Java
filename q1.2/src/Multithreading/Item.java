package Multithreading;

public class Item  {
	
	private String itemId;
	private String itemName;
	
	public Item(String itemId, String itemName)  {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public void Display() {
		System.out.println("Item ID : "+itemId+"  Item Name : "+itemName);
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
	}
	
	
}
