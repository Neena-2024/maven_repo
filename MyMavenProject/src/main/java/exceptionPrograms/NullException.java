package exceptionPrograms;

public class NullException {

	public static void main(String[] args) {
		try {
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}

	}

}
