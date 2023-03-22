package javaPractice;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelData {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream(new File("C:\\Users\\gandh\\Downloads\\TestData.xlsx"));
        Workbook wb = new XSSFWorkbook(fs);
        Sheet s = wb.getSheet("Sheet1");
      //  Row r = s.getRow(1);
        int totalRows = s.getLastRowNum();
        System.out.println(totalRows);
        for (int i = 0; i <= totalRows; i++) {
            System.out.println(s.getRow(i).getCell(0).toString());
        }
        fs.close();
    }
}
