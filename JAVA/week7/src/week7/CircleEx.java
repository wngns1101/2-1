package week7;

public class CircleEx {
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "피자");
		double area = 3.14*pizza.radius*pizza.radius;
		System.out.println(pizza.name + "의 면적 = " + area);
	
		Circle donut = new Circle();
		donut.name = "도넛";
		area = 3.14*donut.radius*donut.radius;
		System.out.println(donut.name + "의 면적" + area);
	}
}
