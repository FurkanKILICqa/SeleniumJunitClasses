package day_16_extentreport_webtable_exel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C02_WebTable extends TestBase {



    //Task 2 : 3. Row'(satır) datalarını print edin
    //Task 3 : Son row daki dataları print edin
    //Task 4 : 5. Column(sütun) datalarini print edin
    //Task 5 : Iki parametreli bir Java metot oluşturalım: printData  Parameter 1 = row numarasi
    //Parameter 2 = column numarasi
    //printData(2,3);  => 2nd satir, 3rd sutun daki datayı print etsin

    @Test
    public void webTableTest() {

        //https://the-internet.herokuapp.com/tables sayfasına gidelim
        driver.get("https://the-internet.herokuapp.com/tables");

        //Task 1 : Table1’i print edin
       WebElement table1 = driver.findElement(By.xpath("//table[1]"));
        System.out.println("Table 1 ==> " + table1.getText());
        System.out.println("=======================\n==============================");

      WebElement thirdBox =  driver.findElement(By.xpath("//table[1]//tr[3]"));
        System.out.println(thirdBox.getText());
        System.out.println("=======================\n==============================");


      WebElement lastRow =  driver.findElement(By.xpath("//table[1]//tbody//tr[last()]"));
        System.out.println(lastRow.getText());
        System.out.println("=======================\n==============================");


       List<WebElement> fifthCollum = driver.findElements(By.xpath("//table[1]//td[5]"));
        for (WebElement w:fifthCollum) {
            System.out.println(w.getText());

        }
    }
}
