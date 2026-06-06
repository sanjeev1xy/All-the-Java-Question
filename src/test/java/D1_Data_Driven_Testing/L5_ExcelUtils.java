package D1_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class L5_ExcelUtils
{
    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook xw;
    public static XSSFSheet xs;
    public static XSSFRow xr;
    public static XSSFCell xc;
    public static CellStyle cs;

    // ✅ Get total number of data rows
    public static int getRowCount(String xlfile, String xlsheet) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);
        int rowcount = xs.getLastRowNum(); // returns last row index (0-based), header is row 0
        xw.close();
        fi.close();
        return rowcount;
    }

    // ✅ Get total number of cells in a row
    public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);
        xr = xs.getRow(rownum);
        int cellcount = xr.getLastCellNum();
        xw.close();
        fi.close();
        return cellcount;
    }

    // ✅ Read cell value as String
    public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);
        xr = xs.getRow(rownum);
        xc = xr.getCell(colnum);

        String data;
        try
        {
            DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(xc);
        }
        catch (Exception e)
        {
            data = "";
        }

        xw.close();
        fi.close();
        return data;
    }

    // ✅ Write Pass with GREEN color — all in ONE file operation
    public static void writePassResult(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);

        xr = xs.getRow(rownum);
        if (xr == null)
            xr = xs.createRow(rownum);

        xc = xr.createCell(colnum);
        xc.setCellValue("Pass");

        cs = xw.createCellStyle();
        cs.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        xc.setCellStyle(cs);

        fo = new FileOutputStream(xlfile);
        xw.write(fo);
        xw.close();
        fi.close();
        fo.close();
    }

    // ✅ Write Fail with RED color — all in ONE file operation
    public static void writeFailResult(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);

        xr = xs.getRow(rownum);
        if (xr == null)
            xr = xs.createRow(rownum);

        xc = xr.createCell(colnum);
        xc.setCellValue("Fail");

        cs = xw.createCellStyle();
        cs.setFillForegroundColor(IndexedColors.RED.getIndex());
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        xc.setCellStyle(cs);

        fo = new FileOutputStream(xlfile);
        xw.write(fo);
        xw.close();
        fi.close();
        fo.close();
    }

    // ✅ Keep these for backward compatibility
    public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);

        xr = xs.getRow(rownum);
        if (xr == null)
            xr = xs.createRow(rownum);

        xc = xr.createCell(colnum);
        xc.setCellValue(data);

        fo = new FileOutputStream(xlfile);
        xw.write(fo);
        xw.close();
        fi.close();
        fo.close();
    }

    public static void fillGreenColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);

        xr = xs.getRow(rownum);
        xc = xr.getCell(colnum);

        cs = xw.createCellStyle();
        cs.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        xc.setCellStyle(cs);

        fo = new FileOutputStream(xlfile);
        xw.write(fo);
        xw.close();
        fi.close();
        fo.close();
    }

    public static void fillRedColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        xw = new XSSFWorkbook(fi);
        xs = xw.getSheet(xlsheet);

        xr = xs.getRow(rownum);
        xc = xr.getCell(colnum);

        cs = xw.createCellStyle();
        cs.setFillForegroundColor(IndexedColors.RED.getIndex());
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        xc.setCellStyle(cs);

        fo = new FileOutputStream(xlfile);
        xw.write(fo);
        xw.close();
        fi.close();
        fo.close();
    }
}