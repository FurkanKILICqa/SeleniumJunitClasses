package day_19_jsexecutor_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_Log4j extends TestBase {

    /*
    1-Log4j kullanabilmek icin oncelikle Log4j-core ve log4j-api dependencyleri pom xml dosyasina ekleriz
    2-project seviyesinde birtane log4jxml dosyasi olusturup configurasyon icin xml kodlarini bu dosyaya ekleriz

     */


    @Test
    public void test01() {

        //  LogManager.getLogger(C02_Log4j.class); kodu parantez icinde belirtilen class
        //  icin bir tane Logger(loglayici) objecti olusturur
       Logger loger = LogManager.getLogger(C02_Log4j.class);


        driver.get("https://www.amazon.com.tr/");
        loger.info("Amazon web sayfasina gidildi");

        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'][1]"));
        loger.info("arama kutusu locate edildi");


        searchBox.sendKeys("selenium");
        loger.info("arama kutusunda selenium aratildi");


    }
}
