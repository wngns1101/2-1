package juhoon;

public class Calculator1Ex {
	public static void main(String[] args) {
		int  radius = 8;
		
		double circleArea = Calculator1.pi * radius * radius;
		System.out.printf("반지름이 %d인 원의 면적 = %.2f\n", radius, circleArea);
		
		int x = 8;
		int y = 7;
		System.out.printf("(%d,%d)의 합=%d\n", x, y, Calculator1.plus(x, y));
		System.out.printf("(%d,%d)의 차=%d\n", x, y, Calculator1.minus(x, y));
		
		
	}
}
