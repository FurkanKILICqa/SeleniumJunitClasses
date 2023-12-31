package day_11_actions_faker;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_ActionsTest extends TestBase {





    //Acilan sayfanin Title in "Your Account" icerdigini dogrula

    @Test
    public void test01() {


        driver.get("https://www.amazon.com/");



        //Sag ust bolumde bulunan "Account & Lists" menüsüne git  "Account" secenegine tikla
        Actions actions = new Actions(driver);
       WebElement accountList = driver.findElement(By.cssSelector("#nav-link-accountList"));

        actions.moveToElement(accountList).perform();


        driver.findElement(By.xpath("//span[.='Account']")).click();


        //Acilan sayfanin Title in "Your Account" olduğunu dogrula
        String expectedData ="Your Account";
        String actualData=driver.getTitle();
        Assert.assertEquals("Actual data ile Expected Data uyumlu degil",expectedData,actualData);

    }












}
