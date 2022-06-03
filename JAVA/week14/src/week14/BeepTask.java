package week14;

public class BeepTask implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("»ß~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
