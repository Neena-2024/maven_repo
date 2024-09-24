package interface_prms;

public class Child2 implements ParentInterface {
	public void show()
	{
		System.out.println("Hai..");
	}
	

	public static void main(String[] args) {
		
		Child1 obj1=new Child1();
		obj1.show();
	}

}
