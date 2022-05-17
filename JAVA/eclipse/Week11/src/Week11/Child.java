package Week11;

public class Child extends Parent {
	private String name;
	public Child(String nation, String name) {
		super(nation);
		this.name = name;
		System.out.println("Child(String name) call");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
