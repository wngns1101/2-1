package midterm;

import java.util.Scanner;

public class conditionIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �¾ ������ �Է��ϼ���");
		int year = sc.nextInt();
		int age = 2022 - year + 1;
		
		if(age >= 20 && age <=26) {
			System.out.println("���л�");
		}else if(age >= 17 && age <20)  {
			System.out.println("����л�");
		}else if(age >= 14 && age < 17) {
			System.out.println("���л�");
		}else if(age >= 8 && age < 14) {
			System.out.println("�ʵ��л�");
		} else {
			System.out.println("�л��� �ƴմϴ�.");
		}
	}
}
