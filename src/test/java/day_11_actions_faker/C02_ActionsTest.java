package day_11_actions_faker;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class C02_ActionsTest extends TestBase {




    //Sayfayı istediğimiz bir miktar yukarıya doğru scroll yapalım

    @Test
    public void test01() {

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com/");


        //Sayfayı istediğimiz bir miktar aşağıya doğru scroll yapalım
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();



        //2. Yol
        for (int i = 0; i <5 ; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            waitForSecond(1);

        }



        for (int i = 0; i <5 ; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
            waitForSecond(1);

        }

    }


    @Test
    public void test02() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com/");


        //Sayfayı istediğimiz bir miktar aşağıya doğru scroll yapalım
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        waitForSecond(1);

        //Acilan sayfanin Title in "Your Account" icerdigini dogrula
        actions.sendKeys(Keys.HOME).perform();

    }

    @Test
    public void test03() {


        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com/");

        WebElement event =  driver.findElement(By.xpath("//*[@class='react__tittle']"));

        Actions actions = new Actions(driver);

        actions.scrollToElement(event).perform();//Hata aldık selenium ile alakalı selenium güncellenince düzelir







    }


}
