package day_09_iframe_windowhandle_basicauthentication;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C02_WindowHandle extends TestBase {

    //Window 1'de https://www.techproeducation.com adresine gidiniz
    //Başlığın "TechPro Education" olduğunu doğrulayın
    //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
    //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
    //techproeducation sayfasına geçiniz:
    //youtube sayfasına geçiniz:
    //linkedIn sayfasına geçiniz:



    @Test
    public void test01() {

        driver.get("https://www.techproeducation.com");
        String techproWindowHandleDegeri = driver.getWindowHandle();

        Assert.assertEquals("TechPro Education",driver.getTitle());


        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandleDegeri = driver.getWindowHandle();


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandleDegeri = driver.getWindowHandle();


        waitForSecond(2);
        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(techproWindowHandleDegeri);
        waitForSecond(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandleDegeri);
        waitForSecond(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandleDegeri);
        waitForSecond(2);

    }

    @Test
    public void test02() {
        driver.get("https://www.techproeducation.com");
        String techproWindowHandleDegeri = driver.getWindowHandle();

        Assert.assertEquals("TechPro Education",driver.getTitle());


        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandleDegeri = driver.getWindowHandle();


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandleDegeri = driver.getWindowHandle();


        waitForSecond(2);
        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(techproWindowHandleDegeri);
        waitForSecond(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandleDegeri);
        waitForSecond(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandleDegeri);
        waitForSecond(2);
    }


    @Test
    public void test03() {
        driver.get("https://www.techproeducation.com");


        Assert.assertEquals("TechPro Education",driver.getTitle());


        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");



        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");


        List<String> windows = new ArrayList<>( driver.getWindowHandles() );
        /*
        Acilmis olan tum pencerelerin yada sekmelerin window handle degerlerini getWindowHandles methodu ile aldik
        Bu method set return eder, ancak setler ile index kullanarak istedigimiz bir elemani secememiz mumkun degildir
        Bu nedenle bizde bu seti kulannarak bir tane list olusturduk
        Cunku List lerde get methodu sayesinde index kullanarak istedigimiz sayfaya cok rahat gecis yapabiliriz
         */

        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(windows.get(0));
        waitForSecond(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(windows.get(1));
        waitForSecond(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(windows.get(2));


    }


    @Test
    public void test04() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

        //Başlığın "TechPro Education" olduğunu doğrulayın
        Assert.assertEquals("TechPro Education",driver.getTitle());

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");


        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        waitForSecond(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        waitForSecond(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());

    }
}
