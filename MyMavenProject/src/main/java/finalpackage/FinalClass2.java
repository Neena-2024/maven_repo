package finalpackage;

public class FinalClass2 extends FinalClass1{  //We can not extend the parent class if we use a final keyword on the parent

	public void show()
	{
		System.out.println("Hai..");
	}
	public static void main(String[] args) {
		FinalClass2 obj=new FinalClass2();
		obj.show();
		obj.display();

	}

}
