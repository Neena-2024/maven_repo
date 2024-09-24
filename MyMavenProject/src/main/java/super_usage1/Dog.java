package super_usage1;

public class Dog extends Animal{
	String name="Malu"; //instance variable with same name as that of parent class variable name
	public void display()
	{
		System.out.println(super.name);  //super should not be the first statement.
		System.out.println(name);
	}
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.display();
	}

}
