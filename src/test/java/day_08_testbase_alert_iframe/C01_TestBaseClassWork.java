package day_08_testbase_alert_iframe;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C01_TestBaseClassWork extends TestBase {

    @Test
    public void test01() {

        //Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        //   -3 farklı test methodu oluşturalım
        //       1.Method:
        //           a. Yil,ay,gün dropdown menu'leri locate ediniz
        //           b. Select objesi olustur
        //           c. Select object i kullaarak 3 farkli sekilde secim yapiniz


        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");


        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        WebElement mount = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));



        selectIndex(year,3);
        waitForSecond(2);
        selectVisible(mount,"May");
        waitForSecond(2);
        selectVisible(day,"5");



    }














}
