package Week11;

public class Parent {
	private String nation;
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	
}
