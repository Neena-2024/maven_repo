package assignments;

public class Area5 {

	public static float areaFind(float r)
	{
		float area;
		area=(3.14f*r*r);
		return area;
		
	}
	public static float areaFind(float l,float b)
	{
		float area;
		area=l*b;
		return area;
	}
	public static double areaFind(double side)
	{
		double area;
		area=side*side;
		return area;
	}
	public static void main(String[] args) {
		
		System.out.println("Area of the circle is:"+Area5.areaFind(3));
		System.out.println("Area of the rectangle is:"+Area5.areaFind(3.0f,4.0f));
		System.out.println("Area of the square is:"+Area5.areaFind(3.00));
	}

}
