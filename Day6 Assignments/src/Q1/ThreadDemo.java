package Q1;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();
		
		obj1.start();
		obj2.start();

	}

}
