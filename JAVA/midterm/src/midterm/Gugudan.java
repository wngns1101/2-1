package midterm;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 몇 단을 계산할까?");
		int cal = sc.nextInt();
		
		System.out.println("구구단" + cal + "단을 계산한다");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(cal + "*" + i +"="+(cal*i));
		}
		sc.close();
	}
}
