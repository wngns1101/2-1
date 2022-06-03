package week14;

public class CalUser2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		try {
			calculator.setMoney(50);
		} catch(InterruptedException e) {}
	}

}
