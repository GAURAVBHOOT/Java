package Q4;

public class Implementation {

	public static void main(String[] args) {
		
		Storage s=new Storage();
		
		Counter c=new Counter();
		
		Print p=new Print();
		c.setPriority(10);
		c.start();
		p.start();

	}

}

