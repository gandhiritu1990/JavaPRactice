package javaPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WriteExcelData {

    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream(new File("C:\\Users\\gandh\\Downloads\\TestData.xlsx"));

        Workbook wb = new XSSFWorkbook(fs);
        Sheet s = wb.createSheet("Student Details1");
        Map<String,Object[]> data = new HashMap<String,Object[]>();
        data.put("1", new Object[]{1,"Ritu"});
        data.put("2", new Object[]{2,"Nikhil"});
        int rowNum = 0;
        for(String key : data.keySet()){
            Row r = s.createRow(rowNum++);
            Object[] oo = data.get(key);
            int cellNum = 0;

            for (Object o: oo){

                Cell c = r.createCell(cellNum++);
                if (o instanceof String){
                    c.setCellValue((String)o);
                } else if (o instanceof Integer){
                    c.setCellValue((Integer)o);
                }

            }

        }
        FileOutputStream os = new FileOutputStream(new File("C:\\Users\\gandh\\Downloads\\TestData.xlsx"));
        wb.write(os);


    }
}
