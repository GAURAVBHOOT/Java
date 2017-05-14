package Q2;

public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread MyThread=new Thread(new MyThread1());
		Thread MyThread2=new Thread(new MyThread1());
		
		MyThread2.setPriority(1);
		MyThread.setPriority(2);
		MyThread.start();
		MyThread2.start();

		
		
	}

}
