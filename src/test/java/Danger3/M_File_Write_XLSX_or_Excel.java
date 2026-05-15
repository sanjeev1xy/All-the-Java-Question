package Danger3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class M_File_Write_XLSX_or_Excel 
{
public static void main(String[] args) throws IOException 
{
File f=new File("../Thakur/M_File_Write_XLSX.xlsx")	;
FileOutputStream fo=new FileOutputStream(f);
XSSFWorkbook xw=new XSSFWorkbook();
XSSFSheet xs=xw.createSheet("SheetA");
for(int i=0;i<6;i++)
{
	XSSFRow xr=xs.createRow(i);
	for(int j=0;j<5;j++)
	{
		XSSFCell xc=xr.createCell(j);
		xc.setCellValue("Sanjeev");
	}
}
xw.write(fo);
fo.flush();
fo.close();
}
}     