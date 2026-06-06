package C_File_Reading_Writing;

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
FileOutputStream fo = new FileOutputStream(f);
XSSFWorkbook xw = new XSSFWorkbook();
XSSFSheet xs = xw.createSheet("Sheet1");

String data[][] = {
        {"Java", "12-05-2023", "Automation"},
        {"Selenium", "15-05-2023", "Automation"},
        {"Appium", "18-05-2024", "Automation"},
        {"Restassured", "30-05-2025", "Automation"},
        {"C#", "31-05-2026", "Automation"}
};
for(int i = 0; i < data.length; i++)
{
    XSSFRow xr = xs.createRow(i);

    for(int j = 0; j < data[i].length; j++)
    {
        XSSFCell xc = xr.createCell(j);
        xc.setCellValue(data[i][j]);
    }
}
xw.write(fo);
xw.close();
fo.close();

System.out.println("Data Written Successfully");
}
}     