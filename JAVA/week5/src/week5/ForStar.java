package week5;

public class ForStar {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 10 + 1);
		
		System.out.println("·£´ı ¼ıÀÚ: " + num);
		
		for(int i = 0 ; i < num ; i++) {
			System.out.print("*");
		}
	}
}
