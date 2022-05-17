package midterm;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		
		System.out.println("Ű�� �Է��ϼ���: ");
		double height = sc.nextFloat();
		height = height / 100.0;
		
		System.out.println("�����Ը� �Է��ϼ���: ");
		int weight = sc.nextInt();
		
		System.out.println(name + "���� �̸���" + height + "m�̰� �����Դ�" + weight + "�Դϴ�");
		
		double bmi = (double)weight/(height*height);
		
		String result = null;
		
		if(bmi >= 18.5 && bmi <= 22.9) {
			result = "����";
			
		} else if(bmi >= 23.0 && bmi <= 24.9) {
			result = "��ü��";
			
		} else if(bmi >= 25.0 && bmi <= 29.9) {
			result = "��";
			
		} else if(bmi >= 30.0) {
			result = "����";
			
		}
		System.out.printf("bmi������  %f�̰� %f�Դϴ�.",bmi, result);
 
		sc.close();
	}
}
