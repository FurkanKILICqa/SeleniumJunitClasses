package day_18_jsexecutor_log4j;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_JsExecutorClick extends TestBase {


    @Test
    public void test02() {
        //amazona gidelim
        driver.get("https://amazon.com");

        waitForSecond(2);

        //sell linkine tiklayalim
        WebElement sellLinki = driver.findElement(By.xpath("//*[.='Sell']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",sellLinki);
    }

    @Test
    public void test01() {

        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();
        driver.navigate().refresh();

        WebElement sellcell = driver.findElement(By.xpath("//*[.='Sell']"));
        jsClick(sellcell);






    }
}
