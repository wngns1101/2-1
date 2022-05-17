package week4;

public class ifDise {
	public static void main(String[] args) {
		//Math.random() 함수는 0~1 사이의 실수를 반환한다.
		double num = Math.random();
		System.out.println("랜덤 숫자 =" + num);
		
		//1~6 사이의 숫자를 랜덤하게 얻기 위해서는 6을 곱한 후 1을 더한다
		int number = (int) ((Math.random()* 6)+1);
		System.out.printf("주사위를 던져서 나온 숫자 :%d", number);
	}
}
