package week14;

public class BeepTaskEx2 {
	public static void main(String[] args) throws InterruptedException{
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("»ß~");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(500);
		}
	}
}
