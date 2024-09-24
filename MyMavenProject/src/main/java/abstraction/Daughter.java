package abstraction;

public class Daughter extends Father {
	public void show()
	{
		System.out.println("How are you?");
	}

	public static void main(String[] args) {
		Daughter obj=new Daughter(); // parent class constructor get invoked her with out using super keyword
		obj.show();
		obj.display();
	}

}
