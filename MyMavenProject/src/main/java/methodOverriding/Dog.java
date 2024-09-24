package methodOverriding;

public class Dog extends Animal {
	public void run()
	{
		System.out.println("This is a dog");
	}

	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.run();
		

	}

}
