package exceptionPrograms;

public class ArithmeticEx {

	public static void main(String[] args) {
		try {
			int a=10/0;  //int a=10/2 is not an exception;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally  //whether the exception is solved or not this block will be executed.
		{
			System.out.println("Hi..");
		}

	}

}
