package week7;

public class PetEx {
	public static void main(String[] args) {
		Pet dog = new Pet("강아지", 8);
		Pet cat = new Pet("고양이", 13);
		Pet bird = new Pet("새", 6);
		
		System.out.println(dog.type + "는" + dog.age + "개월 입니다");
		System.out.println(cat.type + "는" + cat.age + "개월 입니다");
		System.out.println(bird.type + "는" + bird.age + "개월 입니다");
		System.out.println();
		dog.leg = 4;
		cat.leg = 4;
		bird.leg = 2;
		
		System.out.println(dog.type + "다리는" + dog.leg + "입니다");
		System.out.println(cat.type + "다리는" + cat.leg + "입니다");
		System.out.println(bird.type + "다리는" + bird.leg + "입니다");
	}
}
