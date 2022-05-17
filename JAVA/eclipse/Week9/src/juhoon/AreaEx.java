package juhoon;

public class AreaEx {
	public static void main(String[] args) {
		Area mycal = new Area();
		
		double result1 = mycal.areaCal(1.5);
		System.out.println("원의 넓이" + result1);
		
		int result2 = mycal.areaCal(5);
		System.out.println("정사각형 넓이" + result2);
		
		int result3 = mycal.areaCal(3, 5);	
		System.out.println("직사각형" + result3);
	}
	
}
