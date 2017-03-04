
public class Dog extends Animals {

	// States(Fields) of object
	private String name;
	private String breed;
	private int age;
	private String color;

	// Constructor without parameters
	public Dog() {
		super();
		this.name = "Sharo";
		this.breed = "Pug";
		this.age = 6;
		this.color = "beige";
	}

	// Constructor with parameters (only parent`s class parameters)
	public Dog(boolean isAlive, String type) {
		super(isAlive, type);
		this.name = "Sharo";
		this.breed = "Pug";
		this.age = 6;
		this.color = "beige";
	}

	// Constructor with all parameters
	public Dog(boolean isAlive, String type, String name, String breed, int age, String color) {
		super(isAlive, type);
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Behaviour of object
	public void run() {
		System.out.println("I run");
	}
}
