package week13;

public class PolyEx {
	public static void main(String[] args) {
		ClassC classC = new ClassC();
		InterfaceA interA = new ClassC(); //오른쪽 구현 객체가 왼쪽 인터페이스 변수에 대입
		InterfaceB interB = new ClassC(); //이 때 자동 타입 변환이 일어남
		
		classC.methodA(); //클래스 classC가 정의한 모든 멤버를 호출할 수 있다
		classC.methodB(); //클래스 classC가 정의한 모든 멤버를 호출할 수 있다
		
		interA.methodA(); //인터페이스 iterfaceA에 정의되ㅏㄴ 메소드만 호출 가능
		//interA.methodB(); 자동 변환 후에는 해당 인터페이스 멤버만 호출할 수 있다
		
		//interB.methodA(); //classC에 정의되어 있어도 인터페이스로 자옹벼환되면서 호출 불가능
		interB.methodB(); // 인터페이스 interfaceB에 정의된 메소드만 호출 가능

		if(interA instanceof ClassC) {
			ClassC castA = (ClassC)interA;
			castA.methodB();
		}
		
		//interB.methodA();
		interB.methodB();
		
		if(interB instanceof ClassC) {
			ClassC castb = (ClassC)interB;
			castb.methodA();
		}
	}
}
