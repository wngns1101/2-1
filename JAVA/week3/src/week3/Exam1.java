package week3;

public class Exam1 {
	public static void main(String[] args) {
		int m= 100;
		int t = 5;
		
		double v = (double)m / (t*60);
		
		System.out.printf("%d분동안 %d를 이동하는 물체의 속력은 %f입니다\n", t, m, v);
	
	}
}
