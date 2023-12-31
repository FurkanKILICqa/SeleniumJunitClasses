package day_10_cookies_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C01_CookiesTest extends TestBase {

    /*
     Cookies denildiginde aklimiza ilk gelmesi gereken manage methodudur.
    manage() methodu sayesinde cookieler ile ilgili tum islemler yapilir

     */




    @Test
    public void test01() {

        //1-Amazon anasayfaya gidin
        driver.get("https://www.amazon.com.tr/");

       Set<Cookie> cookiesSet = driver.manage().getCookies();//Cookie bir data tipidir like String, int etc.

       // System.out.println(cookies);

        //allCookies.forEach(t-> System.out.println(t.getName()));


        //2-tum cookie'leri consolda bir loop ile yazdirin
        int counter = 1;
        for (Cookie w:cookiesSet) {

            System.out.println(counter+". cookie ==> " + w);
            System.out.println(counter+". cookie name ==> " + w.getName());
            System.out.println(counter+". cookie value ==> " + w.getValue());
            System.out.println(counter+". cookie expire ==> " + w.getExpiry());

            counter++;
        }

        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin

        int actualSize = cookiesSet.size();

        Assert.assertFalse(actualSize>5);//Toplam 5 tane var



        //4-ismi i18n-prefs olan cookie degerinin USD olmadığını test edin
      String actualcookieValue = driver.manage().getCookieNamed("i18n-prefs").getValue();
      String acceptedcookieValue = "USD";

      Assert.assertNotEquals(acceptedcookieValue,actualcookieValue);


        //5-ismi "en sevdigim cookie" ve degeri "cikolatali" olan bir cookie olusturun ve sayfaya ekleyin
        Cookie cookie = new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookie);

        cookiesSet = driver.manage().getCookies();

        int counter1 = 1;
        for (Cookie w : cookiesSet) {
            System.out.println(counter1 + " . cookie  ==> " + w);
            System.out.println(counter1 + " . cookie Name  ==> " + w.getName());
            System.out.println(counter1 + " . cookie Value  ==> " + w.getValue());
            counter1++;
        }

        //6-eklediginiz cookie'nin sayfaya eklendigini test
        Assert.assertTrue(cookiesSet.contains(cookie));



        //7-ismi skin olan cookie'yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");

        cookiesSet = driver.manage().getCookies();

        int counter2 = 1;
        for (Cookie w : cookiesSet) {
            System.out.println(counter2 + " . cookie  ==> " + w);
            System.out.println(counter2 + " . cookie Name  ==> " + w.getName());
            System.out.println(counter2 + " . cookie Value  ==> " + w.getValue());
            counter2++;

        }

        Assert.assertFalse(cookiesSet.contains(driver.manage().getCookieNamed("skin")));

        //8-tum cookie'leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();

        cookiesSet = driver.manage().getCookies();//cookies seti güncelledik

        Assert.assertTrue(cookiesSet.isEmpty());






    }












}
