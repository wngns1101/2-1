package stack;
import java.util.Stack;
public class InfixToPostfix {
		private String infix;	//입력받은 수식
		String postfix = new String();
		Stack<Character> operatorStk = new Stack<Character>();
		Character temp;
		public InfixToPostfix(String inputInfix)	
		{
			this.infix = inputInfix;
			System.out.println("infix -> "+infix);
			System.out.println("#symbol  #연산자Stack  #Postfix표기법	");
		}
		public int prioritize(char op)
		{
			int prio=0;
			switch(op){
				case'+':
				case'-':
					prio=1;
					break;
				case'*':
				case'/':
				case'%':
					prio=2;
					break;
			}
			return prio;
		}
		
		public String result() throws Exception {
		for(int i=0;i<infix.length();i++)
		{
			switch(infix.charAt(i))
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
				postfix = postfix.concat(infix.charAt(i)+"");
				break;
			case'(':
				operatorStk.push((infix).charAt(i));
				break;
			case')':
				while(operatorStk.peek()!='(')
					postfix =	postfix.concat(operatorStk.pop()+"");
				temp =operatorStk.pop();
				break;
			case'+':
			case'-':
			case'*':
			case'/':
			case'%':
				while(!operatorStk.isEmpty()&&(operatorStk.peek())!= '('
				&&prioritize(infix.charAt(i))<=prioritize((operatorStk.peek())))
				{
					postfix = postfix.concat(operatorStk.pop()+"");
				}
				operatorStk.push(infix.charAt(i));
				break;
			default :
				throw new Exception("Syntax Error");//문법에러
			}
			System.out.print(infix.charAt(i)+"\t");
			System.out.print(operatorStk+"\t\t");
			System.out.println(postfix);
		}
		while(!operatorStk.isEmpty())
		{
			postfix = postfix.concat(operatorStk.pop()+"");
			System.out.println("\t\t\t"+postfix);
		}
		System.out.println("postfix -> "+postfix);
			return postfix;
		}	
}

