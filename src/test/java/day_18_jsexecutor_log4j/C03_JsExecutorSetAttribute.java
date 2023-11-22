package day_18_jsexecutor_log4j;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_JsExecutorSetAttribute extends TestBase {



    @Test
    public void test01() {

        driver.get("https://www.amazon.com.tr/");

      WebElement writecell = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='selenium'",writecell);//SearchBox a yazı yazdır dık.
        writecell.submit();



    }

    @Test
    public void test02() {

        driver.get("https://www.amazon.com.tr/");

        WebElement writecell = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        jsSendKeys(writecell,"selenium");


    }

    //amazon sayfasina gidelim
    //arama kutus id attribute degerini ismimiz ile degistirelim
    //degistirmis oldugumuz id ile arama kutusunu locate ederek java aratalim
    @Test
    public void setAttribute() {

        driver.get("https://www.amazon.com.tr/");

        //arama kutus id attribute degerini ismimiz ile degistirelim
        WebElement writecell = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('id','Furkan')",writecell);



        //degistirmis oldugumuz id ile arama kutusunu locate ederek java aratalim
        driver.findElement(By.id("Furkan")).sendKeys("java");





    }
}
