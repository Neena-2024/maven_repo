package super_usage3;

public class Dog extends Animal {
	public Dog()
	{
		super(); //super should be the first statement in constructor
		System.out.println("Barking");
	}

	public static void main(String[] args) {
		Dog obj=new Dog();
		
	}

}
