package exceptionPrograms;

public class ThrowPgm {
	public static void show(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("PERSON IS NOT ELIGIBLE FOR VOTING");
		}
		else
		{
			System.out.println("PERSON IS ELIGIBLE FOR VOTING");
		}
	}

	public static void main(String[] args) {
		ThrowPgm.show(12);

	}

}
