
public class TestClass {

	public static void main(String[] args) {

		Dog dog = new Dog(true, "Dog");

		System.out.println(dog.getIsAlive());
		System.out.println(dog.getType());
		System.out.println(dog.getBreed());
		System.out.println(dog.getAge());
		System.out.println(dog.getColor());

		dog.move();
		dog.run();

		Dolphin dolphin = new Dolphin(true, "Dolphin", "in oceans");

		System.out.println(dolphin.getIsAlive());
		System.out.println(dolphin.getType());
		System.out.println(dolphin.getWhereLive());

		dolphin.move();
		dolphin.swim();
	}
}
