package week14;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(500);
		}
	}
}
