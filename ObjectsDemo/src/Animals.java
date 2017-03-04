
public class Animals {
	
	//States(Fields) of object
	private boolean isAlive;
	private String type;
	
	//Constructor without parameters
	public Animals() {
		this.isAlive = true;
		this.type = type;
	}
	
	//Constructor with parameters
	public Animals(boolean isAlive, String type) {
		this.isAlive = isAlive;
		this.type = type;
	}
	
	//Getters and Setters
	public boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	

	//Behaviour of object
	public void move() {
		System.out.println("I move");
	}

}
