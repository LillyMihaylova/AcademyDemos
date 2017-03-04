
public class Dolphin extends Animals {

	//States(Fields) of object
	private String whereLive;

	//Constructor without parameters
	public Dolphin() {
		this.whereLive = "in oceans";
	}

	//Constructor with parameters (only parent`s class parameters)
	public Dolphin(boolean isAlive, String type) {
		super(isAlive, type);
	}

	//Constructor with all parameters
	public Dolphin(boolean isAlive, String type, String whereLive) {
		super(isAlive, type);
		this.whereLive = whereLive;
	}

	//Getters and Setters
	public String getWhereLive() {
		return whereLive;
	}

	public void setWhereLive(String whereLive) {
		this.whereLive = whereLive;
	}

	//Behaviour of object
	public void swim() {
		System.out.println("I swim");
	}

	public static void main(String[] args) {
		Dolphin dolphin = new Dolphin(true, "Dolphin", "in oceans");
		System.out.println(dolphin.getIsAlive());
		System.out.println(dolphin.getType());
		System.out.println(dolphin.getWhereLive());
		dolphin.move();
		dolphin.swim();

	}

}
