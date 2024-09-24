package exceptionPrograms;

public class Number_FormatException {

	public static void main(String[] args) {
		try {
			String a="Hi";
			int b=Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
	}

}
