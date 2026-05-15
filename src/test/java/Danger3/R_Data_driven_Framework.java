package Danger3;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class R_Data_driven_Framework 
{
//@DataProvider=@DataProvider is used to run one test method 
//multiple times with different sets of data.
	
	@Test(dataProvider="dp2")
public void test1(String username,String password)
{
	System.out.println("username is "+username);
	System.out.println("password is "+password);
}

@DataProvider
public Object[][]dp2() throws BiffException, IOException //array of dp2
{
	File f=new File("../Thakur/I_File_Read_XLS.xls");
	Workbook wb=Workbook.getWorkbook(f);
	Sheet ws=wb.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	Object [][] ob=new Object[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			Cell c1=ws.getCell(j,i);
			ob[i][j]=c1.getContents();
		}
	}
	return ob;
}
}
