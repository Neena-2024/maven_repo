package assignments;

public class Static1 {
	
	static int age1;
	static String name1;
	public static void setValue(String name,int age)
	{
		age1=age;
		name1=name;
		
	}
	public static void getValue()
	{
		System.out.println("Name is: "+name1);
		System.out.println("Age is :"+age1);
		
	}
	public static void main(String[] args) {
		Static1.setValue("Neena",29);
		Static1.getValue();
		

	}

}
