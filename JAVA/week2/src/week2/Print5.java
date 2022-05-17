package week2;

public class Print5 {
	public static void main(String[] args) {
		System.out.println(23 + 18);
		System.out.println("23 + 18 = " + (23+18));
		
		/*숫자 출력 포맷 */
		//% : 프린트 포맷 기호
		//d : decimal(숫자)
		System.out.printf("%d\n", (23+18));
		System.out.printf("숫자 연산: 23 + 18 = %d", (23+18));
		
		System.out.println("\n사칙연산(53, 17)");
		System.out.printf("더하기: 53 + 17 = %d\n", (53+17));
		System.out.printf("빼 기: 53 - 17 = %d\n", (53-17));
		System.out.printf("곱하기: 53 * 17 = %d\n", (53*17));
		System.out.printf("나누기: 53 / 17 = %d\n", (53/17));
		
	}
}
