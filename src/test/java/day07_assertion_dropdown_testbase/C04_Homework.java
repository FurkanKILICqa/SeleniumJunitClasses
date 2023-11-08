package day07_assertion_dropdown_testbase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Homework {

    protected WebDriver driver;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ebay.com/");
    }


    @Test
    public void test03() throws InterruptedException {
        //- Electronics bölümüne tıklayınız
        driver.findElement(By.xpath("(//a[@_sp='p2481888.m1379.l3250'])[1]")).click();


        //- Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
        List<WebElement> images = driver.findElements(By.xpath("//img[@width='225' and @height='225']"));

        for (WebElement w : images) {
            Thread.sleep(1500);
            w.click();
            driver.navigate().back();


            //- Her sayfanın sayfa başlığını yazdıralım
            System.out.println("Sayfa Başlığı ==> " + driver.getTitle());


        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
