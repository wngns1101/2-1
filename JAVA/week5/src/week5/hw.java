package week5;
import java.util.Scanner;


public class hw {
	public static void main(String[] args) {
		System.out.print("이름을 입력하세요: ");
		Scanner name = new Scanner(System.in);
		String bmi_name = name.nextLine();
		
		System.out.print("키(cm)를 입력하세요: ");
		Scanner height = new Scanner(System.in);
		double s_height = height.nextInt();
		double bmi_height = s_height / 100.0;
		
		System.out.print("몸무게(kg)를 입력하세요: ");
		Scanner weight = new Scanner(System.in);
		double bmi_weight = height.nextInt();
		
		double BMI = bmi_weight / (bmi_height * bmi_height);
		
		if(BMI>=18.5 && BMI <= 22.9) {
			System.out.println(bmi_name + "님의 키는" + s_height + "이고 몸무게는"
					+ bmi_weight + "입니다" );
			System.out.println("BMI 지수는" + (Math.ceil(BMI*100)/100.0) + "이고 정상입니다");
		} else if (BMI>=23.0 && BMI <= 24.9) {
			System.out.println(bmi_name + "님의 키는" + s_height + "이고 몸무게는"
					+ bmi_weight + "입니다" );
			System.out.println("BMI 지수는" + (Math.ceil(BMI*100)/100.0) + "이고 과체중입니다");
		} else if (BMI>=25 && BMI <= 29.9) {
			System.out.println(bmi_name + "님의 키는" + s_height + "이고 몸무게는"
					+ bmi_weight + "입니다" );
			System.out.println("BMI 지수는" + (Math.ceil(BMI*100)/100.0) + "이고 비만입니다");
		} else if (BMI >= 30) {
			System.out.println(bmi_name + "님의 키는" + s_height + "이고 몸무게는"
					+ bmi_weight + "입니다" );
			System.out.println("BMI 지수는" + (Math.ceil(BMI*100)/100.0) + "이고 고도비만입니다");
		} else {
			System.out.println("다시 입력해주세요");
		}
			
	}
}
