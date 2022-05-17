package Week11;

public class CarBasicEx {
	public static void main(String[] args) {
		CarBasic car1 = new CarBasic();
		car1.setCompany("현대자돝차");
		car1.setModel("그랜져");
		car1.setColor("오션블루");
		car1.setmaxSpeed(350);
		
		System.out.println(car1.getCompany());
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());
		System.out.println(car1.getmaxSpeed());
	}
}
