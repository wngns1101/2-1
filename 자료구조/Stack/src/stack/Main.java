package stack;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		System.out.print("����ǥ����� �Է��Ͽ��ּ��� : ");
		Scanner in = new Scanner(System.in);
		String inputInfix = new String();
		String inputPostfix = new String();
		inputInfix = in.nextLine();
		
		if(inputInfix == null || inputInfix.length()==0){
	        throw new Exception ("Input Error"); 
	      }
		
		InfixToPostfix iTop = new InfixToPostfix(inputInfix);
		inputPostfix = iTop.result();
		
		Cal oper = new Cal(inputPostfix);
		oper.operate();
	}
}

