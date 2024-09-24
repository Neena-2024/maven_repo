package exception_Excel;

import java.io.IOException;

public class ExcelMain {

public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelRead.getStringData(0,1));//to read string data
		System.out.println(ExcelRead.getIntegerData(0,0));//to read numerical data
}
}
