package exceptionPrograms;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a=10/0;
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
