
public class Main {

	public static void main(String[] args) {
		Product pone=new Product("LCD",20000);
		Product ptwo=new Product("LED",30000);
		Product pthree=new Product("Plasma",40000);
	
		System.out.println(pone.getProductId());
		System.out.println(ptwo.getProductId());
		System.out.println(pthree.getProductId());
	}

}
