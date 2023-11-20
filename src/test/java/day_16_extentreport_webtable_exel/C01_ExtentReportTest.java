package day_16_extentreport_webtable_exel;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_ExtentReportTest extends TestBase {


    @Test
    public void extentResuableFormatTest() {

        rapor("AmazonTesti");

        //Amazon searchbox adında yeni bir test oluşturduk açiklama için üst başlık TestStep yazdık
        extentTest = extentReports.createTest("Amazon SearchBox","TestSteps");

        driver.get("https://www.amazon.com.tr/");

        extentTest.info("Kullanıcı Amazon ana sayfasina gider");

         WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

         searchBox.sendKeys("selenium", Keys.ENTER);
         extentTest.info("Arama kutusuna selenium yazılarak aratıldı");

        Assert.assertTrue(driver.getTitle().contains("selenium"));
        extentTest.pass("Sayfa basliğinin selenium içerdiğini doğrulayın");

        extentReports.flush();





    }
}
