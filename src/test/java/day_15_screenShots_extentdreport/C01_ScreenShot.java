package day_15_screenShots_extentdreport;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_ScreenShot extends TestBase {


    @Test
    public void test01() {

        driver.get("https://techproeducation.com/");

        screenShot();
    }

    @Test
    public void webElementScreenShot() {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        driver.navigate().refresh();
        driver.navigate().refresh();


        //Arama kutusunda laptop aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        searchBox.submit();

        //ekran resmini alalım
        screenShot();

        //sonuc yazısı webelementinin resmini alalım
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));





    }
}
