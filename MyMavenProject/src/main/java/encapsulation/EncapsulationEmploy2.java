package encapsulation;

public class EncapsulationEmploy2 {
	public static void main(String args[])
	{
		EncapsulationEmploy obj=new EncapsulationEmploy();
		obj.setName("Neena");
		System.out.println(obj.getName());
		obj.setAge(29);
		System.out.println(obj.getAge());
		obj.setSalary(25000f);
		System.out.println(obj.getSalary());
		obj.setId(1234);
		System.out.println(obj.getId());
		
	}

}
