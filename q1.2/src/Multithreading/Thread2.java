package Multithreading;


public class Thread2 extends Thread {
	
	SetPut sp=new SetPut();

	@Override
	public void run()  {
		try {
			Thread.sleep(20000);
			sp.put();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
