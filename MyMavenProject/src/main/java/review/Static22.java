package review;

public class Static22 {
	static String name1;
	static int age1;
	public static void setData(String name,int age)
	{
		name1=name;
		age1=age;
		
	}
	public static void getData()
	{
		System.out.println("Name is :"+name1);
		System.out.println("Age is :"+age1);
	}

	public static void main(String[] args) {
		Static22.setData("Neena",29);
		Static22.getData();
		
	}

}
