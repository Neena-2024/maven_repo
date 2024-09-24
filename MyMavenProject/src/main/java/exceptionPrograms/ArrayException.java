package exceptionPrograms;

public class ArrayException {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[10]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)   //or we can also use catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}

	}

}
