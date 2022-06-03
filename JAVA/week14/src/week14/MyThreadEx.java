package week14;

public class MyThreadEx {
	public static void main(String[] args) {
	for(int i=0; i<100; i++) {
		MyThread thread = new MyThread(i+1);
		thread.start();
//		try {
//			thread.join();
//		} catch(InterruptedException e){}
	}
	}
}
