package week4;

import java.util.Scanner;

public class ConditionOperator3 {
	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner scanData = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		score = scanData.nextInt();
		grade = (score>90)? 'a':(score>80)? 'b': 'c';
		
		System.out.println("입력받은 성적: " + score);
		System.out.println("점수 결과는: " + grade);
	}
}
