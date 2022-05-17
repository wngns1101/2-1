package Week11;

import java.util.Scanner;

public class AccountEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account("123-45-6789", "È«±æµ¿", 100000);
		System.out.println("°èÁÂ »ý¼º ¿Ï·á");
		
		account.search();
		
		System.out.println("°èÁÂ ÀÔ±Ý ±Ý¾× >>");
		int amt = sc.nextInt();
		account.setBalance(amt);
		
		account.search();		
		sc.close();
	}
	
}
