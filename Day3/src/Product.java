
public class Product {
	
	private int productId;
	private String productName;
	private int price;
	
	private static int count=1001;
	
	public Product( String productName, int price) {
		super();
		
		this.productId = count;
		this.productName = productName;
		this.price = price;
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}

	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
