package stack;
import java.util.Stack;
public class Cal {
	
	private String postfix = new String(); 
	private int result;
	private String opr = new String();
	Stack<Integer> operandStk = new Stack<Integer>();
	public Cal(String inputPostfix)	
	{
		this.postfix = inputPostfix;
		System.out.println("#symbol\t#연산\t#피연산자stack");
	}
	public void operate()
	{
		int num1,num2;
		for(int i=0;i<postfix.length();i++)
		{
			switch(postfix.charAt(i))
			{
			case'0':
			case'1':
			case'2':
			case'3':
			case'4':
			case'5':
			case'6':
			case'7':
			case'8':
			case'9':
				operandStk.push((int)(postfix.charAt(i)-'0'));
				break;
			case'+':
				num1 = operandStk.pop();
				num2 = operandStk.pop();
				result = num2 + num1;
				operandStk.push(result);
				opr = opr.concat(num2+"");
				opr = opr.concat("+");
				opr = opr.concat(num1+"");
				break;
			case'-':
				num1 = operandStk.pop();
				num2 = operandStk.pop();
				result = num2 - num1;
				operandStk.push(result);
				opr = opr.concat(num2+"");
				opr = opr.concat("-");
				opr = opr.concat(num1+"");
				break;
			case'*':
				num1 = operandStk.pop();
				num2 = operandStk.pop();
				result = num2 * num1;
				operandStk.push(result);
				opr = opr.concat(num2+"");
				opr = opr.concat("*");
				opr = opr.concat(num1+"");
				break;
			case'/':
				num1 = operandStk.pop();
				num2 = operandStk.pop();
				result = num2 / num1;
				operandStk.push(result);
				opr = opr.concat(num2+"");
				opr = opr.concat("/");
				opr = opr.concat(num1+"");
				break;
			case'%':
				num1 = operandStk.pop();
				num2 = operandStk.pop();
				result = num2 % num1;
				operandStk.push(result);
				opr = opr.concat(num2+"");
				opr = opr.concat("%");
				opr = opr.concat(num1+"");
				break;
			}
			System.out.print(postfix.charAt(i)+"\t");
			System.out.print(opr+"\t");
			System.out.println(operandStk);
			opr = "";
		}
		System.out.println("계산결과 -> "+operandStk.pop());
	}
}