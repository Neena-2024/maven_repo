package abstraction;

public class NonAbstraction1 extends Abstraction1 {
	public void show()
	{
		System.out.println("Hai..");
	}

	public static void main(String[] args) {
		NonAbstraction1 obj=new NonAbstraction1();
		obj.show();
		obj.display();

	}

	
		
	}


