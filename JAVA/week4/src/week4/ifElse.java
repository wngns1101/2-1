package week4;

public class ifElse {
	public static void main(String[] args) {
		int score = 83;
		
		System.out.println("score = " + score);
		
		if(score >= 90) {
			System.out.println("점수는 90보다 크거나 같고");
			System.out.println("등급은 A입니다");
		} else if(score >= 80) {
			System.out.println("점수는 80보다 크거나 같고");
			System.out.println("등급은 B입니다");
		} else if(score >= 70) {
			System.out.println("점수는 70보다 크거나 같고");
			System.out.println("등급은 C입니다");
		} else if(score >= 60) {
			System.out.println("점수는 60보다 크거나 같고");
			System.out.println("등급은 D입니다");
		}else {
			System.out.println("점수는 60보다 작고");
			System.out.println("등급은 F입니다");
		}
	}
}
