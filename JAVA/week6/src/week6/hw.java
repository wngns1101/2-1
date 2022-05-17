package week6;

public class hw {
	public static void main(String[] args) {
		int scores[][] = {{49, 80, 20, 100, 80},{43, 60, 85, 30, 90},{49, 82, 48, 50, 100}};
		
		char stu[] =  {'A', 'B', 'C', 'D', 'E'};
		
		int sum[] = new int[5];
		
		for (int j = 0; j < 3; j++)
		for (int i = 0; i < 5;i++) {
			sum[i] += scores[j][i];
	}
		for (int i = 0; i < 5; i++) {
			System.out.printf("%c ÇÐ»ý ÃÑÁ¡: %dÁ¡, Æò±Õ: %fÁ¡\n", stu[i], sum[i], (float)sum[i] / 3.0);
		}
}
}
