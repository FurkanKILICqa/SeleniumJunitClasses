package day_10_cookies_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C02_ActionsTest extends TestBase {









    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");


        //Kutuya sag tıklayın
        WebElement box = driver.findElement(By.id("hot-spot"));


        //Kutuya sag tıklayın
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();


        //Alert'te cikan yazinin"You selected a context menu"oldugunu test edin
        String acpetedResult = "You selected a context manu";
        String actualResult = driver.switchTo().alert().getText();
        Assert.assertEquals("Actual Result ile Expected Result uyumlu degil",acpetedResult,actualResult);



        //Tamam diyerek alert'i kapatın
        driver.switchTo().alert().accept();





    }



}
