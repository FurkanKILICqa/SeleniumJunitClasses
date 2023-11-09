package day_09_iframe_windowhandle_basicauthentication;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

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


        //techproeducation sayfasına geçiniz:



        //youtube sayfasına geçiniz:



        //linkedIn sayfasına geçiniz:



    }
}
