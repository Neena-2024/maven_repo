package string_programs;

public class EqualsIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="java"; //only check if the contents are same or not
		String s3="JAVA";
		String s4="python";
		String s5="JAVA ";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s3.equalsIgnoreCase(s5));

	}

}
