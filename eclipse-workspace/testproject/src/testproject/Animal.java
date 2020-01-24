package testproject;

public class Animal {
private String animalType = "basic animal type";
private int age;
private String name = "The name!";

public Animal() {
	//System.out.println("default animal constructor");
}
public Animal(int age, String name) {
	//System.out.println("default animal constructor with name and age");
	this.setAge(age);
	this.setName(name);
}

public String getName() {
	return name;
}

public int setAge(int age) {
	return age;
	}
public int getAge() {
	return age;
}
public String setName(String name) {
	return name;
	}

public String getAnimalType() {
	return animalType;
}

public void setAnimalType(String animalType) {
	this.animalType = animalType;
}
public String sayHello() {
	return "What sound do animals make??";
}

}
