package week4;

public class twoOperand1 {
	public static void main(String[] args) {
		int apple =1;
		int number =7;
		double pieceUnit = 0.1;
		
		double result = apple - pieceUnit*number;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + " 조각이 남는다");
		
		System.out.println("---------------------------");
		int totalPieces = apple * 10;
		int calPieces = totalPieces - number;
		
		result = calPieces / 10.0;
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + " 조각이 남는다");
		
	}
}
