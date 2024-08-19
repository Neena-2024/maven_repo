package assignments;

public class Numbers4 {
	public static double average(int n1,int n2,int n3)
	{
		double avg;
		avg=(n1+n2+n3)/3.0;
		return avg;
	}
	public static float average(float n1,float n2,float n3)
	{
		float avg;
		avg=(n1+n2+n3)/3.0f;
		return avg;
	}

	public static void main(String[] args) {
		System.out.println("Average of integers is:"+Numbers4.average(2,4,5));
		System.out.println("Average of float numbers are :"+Numbers4.average(2.2f,1.1f,3.3f));
	}

}
