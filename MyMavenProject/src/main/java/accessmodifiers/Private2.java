package accessmodifiers;

public class Private2 {

	public static void main(String[] args) {
		Private1 obj=new Private1();
		obj.show();
		System.out.println(obj.a);  //here we can not access a. bcos ithis a private variable

	}

}
