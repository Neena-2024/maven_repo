package interface_prms;

public class Son implements FatherInterface,MotherInterface{
	public void show()
	{
		System.out.println("Hai...");
	}

	public static void main(String[] args) {
		Son obj=new Son();
		obj.show();

	}

}
