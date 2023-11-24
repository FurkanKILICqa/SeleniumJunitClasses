package day_19_jsexecutor_log4j;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_JsExecuterStyle extends TestBase {







    @Test
    public void test01() {

        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com.tr/");

        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'][1]"));
        searchBox.sendKeys("selenium");

        //aramakutusunun style özelliklerini degistirelim
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='5px solid red'",searchBox);

        //searchBox webelementinin arkaplan rengini yesil yaptik
        js.executeScript("arguments[0].style.backgroundColor='green'",searchBox);

        //searcBox webelementinin metin rengini beyaza cevirdik
        js.executeScript("arguments[0].style.color='white'",searchBox);


        //sayfanin ekran görüntüsünü alalim
        screenShot();



    }
}
