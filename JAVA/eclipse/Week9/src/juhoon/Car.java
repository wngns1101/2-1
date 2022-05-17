package juhoon;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. 남은 가스는: "+ gas);
				gas--;
			} else {
				System.out.println("멈춥니다");
				break;
			}
		}
	}
	
}
