package week4;

public class ConditionOperator2 {
	public static void main(String[] args) {
		int score = 85;
		String result;
		
		result = (score > 90)? "우수": ((score > 80)? "보통": "미달");
		
		System.out.println("점수는= " + score);
		System.out.println("점수결과는= " + result);
	}
}
