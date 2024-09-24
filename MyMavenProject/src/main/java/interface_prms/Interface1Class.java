package interface_prms;

public class Interface1Class implements Interface1{
	public void show()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Interface1Class obj=new Interface1Class();
		obj.show();
		
	}

}
