package week5;

import java.io.IOException;

public class KeyControl2 {
	public static void main(String[] args) throws IOException {
		int keycode = 0;
		int count = 0;
		
		System.out.println("값을 입력하새요");
		
		while (true) {
			keycode = System.in.read();
			
			if(keycode != 13 && keycode != 10) {
				System.out.println("입력한 값은" + (char) keycode + "입니다");
				System.out.println("숫자를 입력하세요(0~9)");
			
			
			//키보드로 값을 입력받을 때마다카운트에서 5번을 입력받으면 빠져나가도록 한다
			count++;
			
			if(count > 5) {
				break;
			}
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
