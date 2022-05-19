package week12;

public class Cat extends Animal {
	public Cat() {
		this.kind = "표유류";
	}
	
	@Override
	
	public void sound() {
		System.out.println("야옹");
	}
	
	public void catLife() {
		System.out.println("cat 평균 수명은 약 12~15년 입니다.");
	}
}
