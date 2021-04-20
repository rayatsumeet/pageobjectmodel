package Utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.math3.geometry.spherical.oned.S1Point;
import org.testng.annotations.DataProvider;


public class Data {
	@DataProvider(name = "getData")
	public Object[][] getData(Method m) throws IOException
	{
		
		 String path = System.getProperty("user.dir") +"/Excel/Testdatap.xlsx";
		 
		 String sheetname = m.getName();
		 System.out.println(sheetname);
		 int rowcount = XlUtils.getRowCount(path, sheetname);
		 int colcount = XlUtils.getCellCount(path, sheetname, 1);
			//String data[][] = {{"shyam","20660","22"},{"ghanshyam","206099","32"},{"rajvada","250000","22"}};
		 
		 Object data[][] = new Object [rowcount][colcount];
		
		 for(int i = 1;i<=rowcount;i++)
		 {
			 for(int j=0; j<colcount;j++)
			 {
				 
			data[i-1][j]	= XlUtils.getCellData(path, sheetname, i, j) ;
			 }
				
			 }
		 return(data);
	}
	
//	public static boolean isTestRunnable(String testName, XlUtils excel) throws IOException
//	{
//		String path = System.getProperty("user.dir") +"/excel/Testdata.xlsx";
//		int row =	XlUtils.getRowCount(path, "test_suite");
//		int col = XlUtils.getCellCount(path, "test_suite", 1);
//		 Object data[][] = new Object [row][col];
//		for(int rownum=1;rownum<=row;rownum++)
//		{
//			for(int colnum=0;colnum<col;colnum++)
//			{
//				data[rownum-1][colnum]=	XlUtils.getCellData(path, "test_suite", rownum, colnum);
//				if()
//			}
//		}
//	}
	
}
