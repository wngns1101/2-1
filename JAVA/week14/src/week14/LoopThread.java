package week14;

public class LoopThread extends Thread {
	public LoopThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(getName());
		}
	}
}
