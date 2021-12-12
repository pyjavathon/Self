package part07.exam03;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("-------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		System.out.println("-------------");
	}
	
	public static void animalSound(Animal animal) { //20,21줄 자동타입변환 됨
		animal.sound();
	}

}
