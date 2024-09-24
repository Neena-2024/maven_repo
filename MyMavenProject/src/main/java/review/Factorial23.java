package review;

public class Factorial23 {
	static int num=5,fact=1;
	public static void show()
	{
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("The factorial of 5 is : "+fact);
	}

	public static void main(String[] args) {
		Factorial23.show();

	}

}
