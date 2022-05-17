package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		System.out.println("SCORE\t\tGRADE");
		System.out.println("======================");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("프로그램 종료");
				break;
			}else if(num >= 90){
				System.out.printf("%d\t\t%c", num, 'A' );
			} else if(num >= 80){
				System.out.printf("%d\t\t%c", num, 'B' );
			} else if(num >= 70) {
				System.out.printf("%d\t\t%c", num, 'c' );
			} else if(num >= 60) {
				System.out.printf("%d\t\t%c", num, 'd' );
			} else {
				System.out.printf("%d\t\t%c", num, 'f' );
			}
			
		}
			
	}
}
