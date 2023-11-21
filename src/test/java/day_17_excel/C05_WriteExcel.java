package day_17_excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C05_WriteExcel {

        //Bir "Name" sütunu oluşturup isimlerini excel doyasına yazınız:
     // ("ayhan","beyhan","ceyhan","ali","veli","ahmet","can","sam","kate","raj","pam")
    @Test
    public void test01() throws IOException {


        String path = "C:\\Users\\hpvic\\IdeaProjects\\B189SeleniumJunitDT\\src\\test\\java\\resources\\mysmoketestdata.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("customer_info");
        Row row = sheet.getRow(0);

        sheet.getRow(0).createCell(3).setCellValue("Name");
        sheet.getRow(1).createCell(3).setCellValue("ayhan");
        sheet.getRow(2).createCell(3).setCellValue("beyhan");
        sheet.getRow(3).createCell(3).setCellValue("ceyhan");
        sheet.getRow(4).createCell(3).setCellValue("ali");
        sheet.getRow(5).createCell(3).setCellValue("veli");
        sheet.getRow(6).createCell(3).setCellValue("ahmet");
        sheet.getRow(7).createCell(3).setCellValue("can");
        sheet.getRow(8).createCell(3).setCellValue("sam");
        sheet.getRow(9).createCell(3).setCellValue("kate");
        sheet.getRow(10).createCell(3).setCellValue("raj");
        sheet.getRow(11).createCell(3).setCellValue("pam");

        FileInputStream fos = new FileInputStream(path);
        workbook.write(fos);
        fos.close();
        fis.close();






    }
}
