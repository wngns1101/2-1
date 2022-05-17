package week2;

public class Print4 {
	public static void main(String[] args) {
		/* 문자열 출력 포멧(printf) */
		/*
		 * % : 프린트 포맷 기호
		 * s: 문자열(String)
		 * \n: 줄바꿈
		 */
		//프린트 포멧에 정의된 변수의 갯수보다 많은 값을 나열하는 것은 가능
		System.out.printf("이름: %s, %s\n", "자바", "이클립스", "hello");
		
		//프린트 포멧에 정의된 변수의 갯수보다 적은 값을 나열하는 것은 에러발생
		//System.out.printf("이름 : %s,%s,%s","자바","이클립스");
		System.out.printf("이름: %s,%s,%s","자바","이클립스","hello");
	}
}
