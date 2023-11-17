package day_14_exception_screenshot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_StaleElementReferenceException extends TestBase {









    @Test
    public void test01() {
        driver.get("https://www.amazon.com.tr/");

        driver.findElement(By.xpath("//*[@name='accept']")).click();

      WebElement searchBpx = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

      searchBpx.sendKeys("laptop", Keys.ENTER);

      waitForSecond(2);
      driver.navigate().back();

      searchBpx.sendKeys("dekstop");//locator bayatladı eskidi
      searchBpx.submit();





    }
}
