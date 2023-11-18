package day_15_screenShots_extentdreport;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_ScreenShotClassWork extends TestBase {




    //Sayfada görüntülenen telefon numarasinin +1 585 304 29 59 oldugunu dogrulayin
    //Techpro ana sayfasi en altta logonun görüntülendigini dogrulayin
    //logonun ekran goruntusunu alalım



    @Test
    public void test01() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com/");

        //Ana sayfanın başarıyla yüklendiğini doğrula.
        String expectedUrl = "https://techproeducation.com/";
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());

        //Sayfanın ekran görüntüsünü alin
        screenShot();

       WebElement telNumber = driver.findElement(By.xpath("(//a[.='+1 585 304 29 59'])[1]"));
        System.out.println("telNumber.getText() = " + telNumber.getText());

        Assert.assertEquals(telNumber.getText(),"+1 585 304 29 59");

        acreenShotOfWebElement(telNumber);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        //Techpro ana sayfasi en altta logonun görüntülendigini dogrulayin
        WebElement logo = driver.findElement(By.xpath("//img[@class='footerLogo']"));
        Assert.assertTrue(logo.isDisplayed());

        //logonun ekran goruntusunu alalım
        acreenShotOfWebElement(logo);



    }

    @Test
    public void amazonSearchBox() {

        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com.tr/");


        //Ve sayfanın resmini alalım
        screenShot();

        //Arama kutusuna metin göndererek ekran goruntusun alalim
        WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("kitap");
        acreenShotOfWebElement(searchBox);






    }
}
