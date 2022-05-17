package week3;

public class DataType3 {
	public static void main(String[] args) {
		char cData1= 'A';
		char cData2 = 65;
		char cData3 = '\u0041';
		System.out.println("cData1 = " + cData1);
		System.out.println("cData2 = " + cData2);
		System.out.println("cData3 = " + cData3);
		
		char cData4 = '°¡';
		char cData5 = 44032;
		char cData6 = '\uac00';
		
		System.out.println("cData4 = " + cData4);
		System.out.println("cData5 = " + cData5);
		System.out.println("cData6 = " + cData6);
		
		int cData7 = 'B';
		int cData8 = 'ÇÏ';
		int cData9 = '&';
		System.out.println("cData7 = " + cData7);
		System.out.println("cData8 = " + cData8);
		System.out.println("cData9 = " + cData9);
		
		int cData10 = cData7+cData9;
		char cData11 = (char) (cData7+cData9);
		
		System.out.println("cData7 + cData9 " + cData10);
		System.out.println("(cData7+cData9) " + cData11);
	}
}
