package day_18_jsexecutor_log4j;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_JsExecutorLocate extends TestBase {


    @Test
    public void test01() {

        //https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html   adresine gidelim
        //Hello Shadow DOM elementini locate edelim

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");

     // String shadow = driver.findElement(By.xpath("//*[@class='display-6']")).getText();
     //  Assert.assertEquals("Shadow DOM",shadow);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return document.getElementById(\"content\");");

    }

    @Test
    public void amazonTest() {

        driver.get("https://www.amazon.com.tr/");

        WebElement writecell = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        writecell.sendKeys("selenium");
        JavascriptExecutor js = (JavascriptExecutor) driver;





    }
}
