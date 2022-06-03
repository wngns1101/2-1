package week14;

public class WaitNotifyEx {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread prodThread = new ProducerThread(dataBox);
		ConsumerThread consThread = new ConsumerThread(dataBox);
		
		prodThread.start();
		consThread.start();
	}
}
