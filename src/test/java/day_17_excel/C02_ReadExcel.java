package day_17_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {




    //Örnek 4: Sayfadaki son satırin index ini yazdırınız
    //Örnek 5: Excel sayfasindaki datalari COUNTRY,CAPITALS (Ülke-Başkent) key-value şeklinde console a yazdiriniz
    // {{USA,D.C},{FRANCE,PARIS}....}

    @Test
    public void test01() throws IOException {
        //Örnek 1: Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
        String path = "C:\\Users\\hpvic\\IdeaProjects\\B189SeleniumJunitDT\\src\\test\\java\\resources\\Capitals.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);

        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(1));

        //Örnek 2: 3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
       String actualCell = workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
       String exceptedCell = "France";

        Assert.assertEquals(exceptedCell,actualCell);


        //Örnek 3: Kullanılan satır sayısın bulun
        workbook.getSheet("Sheet1").getPhysicalNumberOfRows();//Satırların sayısını verir





    }
}
