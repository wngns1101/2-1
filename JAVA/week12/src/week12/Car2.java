package week12;

public abstract class Car2 {
	int speed = 0;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
	
	abstract void work();
}
