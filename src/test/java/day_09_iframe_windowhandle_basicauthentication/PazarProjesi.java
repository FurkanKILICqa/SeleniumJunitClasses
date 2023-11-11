package day_09_iframe_windowhandle_basicauthentication;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class PazarProjesi extends TestBase {


    //dmauri.keyden@forkshape.com
    //keyden1234

    @Test
    public void test01() {
        //https://www.hackerrank.com/ sitesine git
        driver.get("https://www.hackerrank.com/");


        //Log-in butonuna tıkla
        driver.findElement(By.xpath("(//a)[29]")).click();


        //For developers koşulu ile Log-in yap
        driver.findElement(By.xpath("//*[@class='hr_button']")).click();


        //Your username or email kutusuna kayıtlı E-mail adresini gir
       WebElement nameBox = driver.findElement(By.id("input-1"));
       nameBox.sendKeys("dmauri.keyden@forkshape.com");


        //Your password kutusuna kayıtlı şifre gir
       WebElement passwordBox = driver.findElement(By.id("input-2"));
       passwordBox.sendKeys("keyden1234");


       //Remember me kutusunu eğer işaterli değilse işaretle
       WebElement rememberMe = driver.findElement(By.className("checkbox-input"));

      if (!rememberMe.isSelected()){

          rememberMe.click();
      }
        Assert.assertTrue(rememberMe.isSelected());

        //Log-in butonuna tıkla
       WebElement logIn =  driver.findElement(By.xpath("(//*[@class='ui-text'])[2]"));
       logIn.click();


    }
}
