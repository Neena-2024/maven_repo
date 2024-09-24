package finalpackage;

public class FinalVariable {
	final int num=10; //Here num is a constant. bcoz we use a final keyword here.
	public void display()
	{
		//num=20;  //Error should be shown.Because we use a final keyword so that we cant change its value
		System.out.println(num);
	}

	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.display();
		
	}

}
