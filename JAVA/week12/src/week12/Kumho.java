package week12;

public class Kumho extends Tire {
	public Kumho(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
		System.out.println(location + "금호타이어 남은 수명" + (maxRotation-accRotation) + "회");
		return true;
	} else {
		System.out.println("*** " + location + "금호타이어 펑크 ***");
		return false;
	}
}
}
