package Q4;

public class Print extends Thread  {
	
	Storage[] str = new Storage[100];
	Counter c;


public Print() {
		super();
	}


public void run() {
	c=new Counter();
	str = c.getArr();
	for(int i=0;i<100;i++)
	{
		System.out.println("Printing : "+str[i]);
	}
	
	
}
}