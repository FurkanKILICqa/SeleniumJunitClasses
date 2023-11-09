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
        driver.getWindowHandle();


        Assert.assertEquals("TechPro Education",driver.getTitle());


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();



        driver.switchTo().newWindow(WindowType.WINDOW);




    }
}
