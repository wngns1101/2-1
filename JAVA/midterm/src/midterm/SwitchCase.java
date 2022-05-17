package midterm;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.println("키를 입력하세요: ");
		double height = sc.nextFloat();
		height = height / 100.0;
		
		System.out.println("몸무게를 입력하세요: ");
		int weight = sc.nextInt();
		
		System.out.println(name + "님의 이름은" + height + "m이고 몸무게는" + weight + "입니다");
		
		double bmi = (double)weight/(height*height);
		
		String result = null;
		
		if(bmi >= 18.5 && bmi <= 22.9) {
			result = "정상";
			
		} else if(bmi >= 23.0 && bmi <= 24.9) {
			result = "과체중";
			
		} else if(bmi >= 25.0 && bmi <= 29.9) {
			result = "비만";
			
		} else if(bmi >= 30.0) {
			result = "고도비만";
			
		}
		System.out.printf("bmi지수는  %f이고 %f입니다.",bmi, result);
 
		sc.close();
	}
}
