package week12;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=0; i<=10; i++) {
			int flat = car.run();
			if(flat == 1) {
				System.out.println("한국타이어로 교체");
				car.frontLeft = new HanKook("앞왼쪽", 15);
			} else if(flat == 2) {
				System.out.println("한국타이어로 교체");
				car.frontRight = new HanKook("앞오른쪽", 15);
			} else if(flat == 3) {
				System.out.println("금호타이어로 교체");
				car.backLeft = new Kumho("뒤왼쪽", 15);
			} else if(flat == 4) {
				System.out.println("금호타이어로 교체");
				car.backRight = new Kumho("뒤오른쪽", 15);
			}
			System.out.println("------------");
		}
	}
}
