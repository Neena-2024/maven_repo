package interface_prms;

public class Baby implements Daddy,Mommy {
	public void show()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Baby obj=new Baby();
		obj.display();
		obj.show();
		
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
