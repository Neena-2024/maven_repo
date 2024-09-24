package abstraction;

public class Child2 extends Parent {
	public void show()
	{
		System.out.println("One");
	}
	public static void main(String args[])
	{
		Parent obj=new Child1();  //upcasting . this is hierarchial inheritaance . so we use this upcasting
		obj.show();
		Parent obj1=new Child2();
		obj1.show();
		obj.display();
	}

}
