package testproject;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animalTest = new Animal(1,"tweetybird");
		System.out.println("Animaltype is "+ animalTest.getAnimalType());
		System.out.println("Animal says "+ animalTest.sayHello());
		System.out.println("Animal Name "+ animalTest.getName());
		System.out.println("Animal age "+ animalTest.getAge());
		
		//Dog dtest=new Dog();
		Dog dtest=new Dog(3,"fido");
		
		
		System.out.println("Animal age "+ dtest.getAge());
		System.out.println("Animal name "+ dtest.getName());
		//Animal dogtest1 =new Dog();
		//System.out.println("Animaltype is "+ dogtest1.getAnimalType());
		//System.out.println("Animal says "+ dogtest1.sayHello());
	}

}
