package day07_assertion_dropdown_testbase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assertion {
    WebDriver driver;
/*
    https://www.youtube.com adresine gidin
        Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin


        TEST2=> Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        TEST3=> wrongTitleTest  => Sayfa basliginin "youtube" olmadigini dogrulayin

     */

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
    }




    //TEST1=> Sayfa başlığının "YouTube" oldugunu test edin  (//*[@id='logo-icon'])[1]
    @Test
    public void paceTitle() {

        String actualTitle = driver.getTitle();
        String acceptedTitle = "YouTube";
        Assert.assertEquals(actualTitle,acceptedTitle);

       //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
       WebElement logo = driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]"));
       logo.isDisplayed();
       Assert.assertTrue(logo.isDisplayed());//True


    }

    @Test
    public void test02() {
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searchBox.isEnabled());
    }

    @Test
    public void test03() {
        //TEST3=> wrongTitleTest  => Sayfa basliginin "youtube" olmadigini dogrulayin
        String actualTitle = driver.getTitle();
        String unacceptedTitle = "youtube";
        Assert.assertNotEquals(actualTitle,unacceptedTitle);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}
