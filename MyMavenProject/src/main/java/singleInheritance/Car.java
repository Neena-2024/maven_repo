package singleInheritance;

public class Car extends Vehicle{
	public void display()
	{
		System.out.println("This is a car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.show();
		obj.display();
		

	}

}
