package methodOverloading;

public class MethodOverload {
	public void display()
	{
		System.out.println("Hello");
	}
	public void display(char a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
	MethodOverload obj=new MethodOverload();
	obj.display();
	obj.display('A',"jAVA");
	}

}
