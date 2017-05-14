package Q4;

public class Counter extends Thread {
	
Storage arr[]=new Storage[100];
@Override	
	public void run() {
		
		for (int i = 0; i <100; i++) {
			
			Storage s=new Storage(i);
			arr[i]=s;
		/*	System.out.println(s);*/
			//s.setI(i);
			
			
		}
		
		
	}
public Storage[] getArr() {
	return arr;
}
	
}

