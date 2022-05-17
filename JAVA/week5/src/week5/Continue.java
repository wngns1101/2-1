package week5;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0 ; i < 100; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		}
}
