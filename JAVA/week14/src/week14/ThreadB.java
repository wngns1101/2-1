package week14;

public class ThreadB extends Thread{
	public ThreadB() {
		setName("Thread B");
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName() + "ÀÛµ¿Áß");
		}
	}

}
