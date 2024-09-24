package aggregation;

public class Employee {
	int id;
	String name;
	Address address; //first class nte reference object aayitt  variable create cheyyunnu. 
	public Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		Address obj1=new Address("TVM","Kerala","India");
		Employee obj=new Employee(123,"Neena",obj1);
		obj.display();
		
		
	}

}
