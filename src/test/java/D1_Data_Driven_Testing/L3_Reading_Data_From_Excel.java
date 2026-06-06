package D1_Data_Driven_Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class L3_Reading_Data_From_Excel 
{
	//Excel File---->Workbook---->Sheets---->Rows---->Cells
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../Thakur/testdata/Data_Driven_Testing_Excel.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xw=new XSSFWorkbook(fi);
		XSSFSheet xs=xw.getSheetAt(0);
		int r=xs.getPhysicalNumberOfRows();
		DataFormatter formatter = new DataFormatter();

		for(int i=0; i<r; i++)
		{
		    XSSFRow xr = xs.getRow(i);
		    int c = xr.getPhysicalNumberOfCells();

		    for(int j=0; j<c; j++)
		    {
		        XSSFCell xc = xr.getCell(j);
		        String value = formatter.formatCellValue(xc);
		        System.out.println(value);
		    }
		}
	}
}
