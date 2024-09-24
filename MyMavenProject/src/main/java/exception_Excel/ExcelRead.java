package exception_Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	static FileInputStream f;//globally declared class,used to read datas from a file

	static XSSFWorkbook w;// XssFWorkBook is a java class in the library apache poi used to work with excel files in java

	static XSSFSheet sh;//XssFSheet is ajava class in the apachepoi library representing an excel worksheet in java



	

	public static String getStringData(int a,int b) throws IOException

	//inta,int b address of cell

	//here we used static method since it is easy to access data between this static and static mainmethod

	{

		f=new FileInputStream("C:\\Users\\neena\\OneDrive\\Desktop\\ExcelRead.xlsx"); //since globally declared ,

		//no need of declaring FileInputStream f=new FileInputStream(); inside this method

		//here the file in the path given is assigned to variable f

	w=new XSSFWorkbook(f);//variable containing  workbook file from the f file

	sh=w.getSheet("Sheet1");//name of excel sheet,sheet name inside worbook included 

	Row r= sh.getRow(a);//interface Row  row- variable a

	Cell c=r.getCell(b);//interface Cell variable b

	return c.getStringCellValue();//here string value from the excel is returned

	}

public static String getIntegerData(int a,int b) throws IOException

{

	f=new FileInputStream("C:\\Users\\neena\\OneDrive\\Desktop\\ExcelRead.xlsx");//since globally declared 

	//no need of declaring FileInputStream f=new FileInputStream(); inside this method

	w=new XSSFWorkbook(f);//variable containing filepath included in workbook

	sh=w.getSheet("Sheet1");//name of excel sheet,sheet name inside worbook included 

	Row r= sh.getRow(a);//interface Row  row- variable a

	Cell c=r.getCell(b);//interface Cell 

	int x=(int)c.getNumericCellValue();//typecasting converting string to integer and saved in x

	return String.valueOf(x);//here the integer value in x variable got from the file is converted to string and returned

	

	}

}
