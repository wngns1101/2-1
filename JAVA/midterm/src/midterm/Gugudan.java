package midterm;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �� ���� ����ұ�?");
		int cal = sc.nextInt();
		
		System.out.println("������" + cal + "���� ����Ѵ�");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(cal + "*" + i +"="+(cal*i));
		}
		sc.close();
	}
}
