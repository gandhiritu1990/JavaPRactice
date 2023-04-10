package javaPractice;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class CopyFromOneExcelToAnother {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(new File("C:\\Users\\gandh\\Downloads\\TestData.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet inputSheet = wb.getSheetAt(0);
        String sheetName = inputSheet.getSheetName();

        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\gandh\\Downloads\\OutputSheet.xlsx"));
        XSSFWorkbook outputwb = new XSSFWorkbook();
        XSSFSheet outputSheet = outputwb.createSheet(sheetName);
        copyExcelData(inputSheet,outputSheet);
        outputwb.write(fos);


    }

    public static void copyExcelData(XSSFSheet input, XSSFSheet output){

        for(int i =0; i< input.getLastRowNum()+1; i++){
            int cellCount = input.getRow(i).getLastCellNum();
            Row r = output.createRow(i);
            for(int j =0; j< cellCount; j++){
                String cellData = input.getRow(i).getCell(j).toString();
                System.out.println(cellData);
                r.createCell(j).setCellValue(cellData);
            }

        }
    }
}
