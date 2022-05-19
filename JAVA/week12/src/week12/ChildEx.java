package week12;

public class ChildEx {
	public static void main(String[] args) {
		// Parent 클래스를 상속받은 Child 클래스를 이용하여 객체를 생성
		Child child = new Child();
		// 자식 클래스로 생성된 객첸ㄴ 부모 클래스로 생성된 객체에 대입할 수 있다
		// 이 때 자동 타입 변환된다
		Parent parent = child;
		
		parent.method1();
		//자동 타입 변환이 적둉된 경우 부모 클래스 객체라도 자식 클래스의 재정의된 메소드가 호출된다.
		parent.method2();
		
		//자식 객체가 부모 객체로 타입 변환되면 자식 객체에만 정의된 메소드는 호출될 수 없다
		//parent.method3();
	}
}
