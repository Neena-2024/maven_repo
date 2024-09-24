package HierarchicalInheritance;

public class Colour2 extends Flower{
	public void pink()
	{
		System.out.println("Pink rose");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour2 obj=new Colour2();
		obj.rose();
		obj.pink();
		Colour obj1=new Colour();
		obj1.red();

	}

}
