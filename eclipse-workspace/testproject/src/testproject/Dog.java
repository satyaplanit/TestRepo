package testproject;

public class Dog extends Animal{
		public Dog(int age, String name) {
			super(age,name);
			//System.out.println("dog constructure with age and name");
			//setAge(age);
			//setName(name);
			setAnimalType("Canine");
			
		}
		public String sayHello() {
			return "woof";
		}
		
	}


