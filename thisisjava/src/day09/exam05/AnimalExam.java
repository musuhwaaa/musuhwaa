package day09.exam05;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(cat);

	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
