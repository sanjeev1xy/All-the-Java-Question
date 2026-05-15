package Danger3;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class I_File_Read_XLS
{
public static void main(String[] args) throws BiffException, IOException 
{
File f=new File("../Thakur/I_File_Read_XLS.xls");
Workbook wk=Workbook.getWorkbook(f);
Sheet ws=wk.getSheet(0); //0 is the index of number of sheet 1
int r=ws.getRows();
int c=ws.getColumns();
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		Cell c1= ws.getCell(j,i);//firstly enter the column then row i.e (j,i)
		System.out.println(c1.getContents());
	}
}
}
}
