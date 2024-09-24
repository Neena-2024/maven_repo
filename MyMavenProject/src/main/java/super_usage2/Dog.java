package super_usage2;
public class Dog extends Animal {
	public void run()
	{
		super.run(); //super should not be the first statement in method. it can be given next to the sysout.
		System.out.println("This is a Dog");
		//super.run();
	}

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.run();

	}

}
