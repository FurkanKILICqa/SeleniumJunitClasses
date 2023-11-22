package day_18_jsexecutor_log4j;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_IsExecutorScroll extends TestBase {


    @Test
    public void sclrollwithJS() {


        //https://testpages.herokuapp.com/ adresine gidiniz
        driver.get("https://testpages.herokuapp.com/");


        //Challenges a kadar scroll yapiniz
      WebElement challenge = driver.findElement(By.xpath("//*[.='Challenges']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",challenge);//True dersek yazı üstte kalır false dersek altta kalır




    }

    @Test
    public void scrollWithJs2() {

        driver.get("https://techproeducation.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        waitForSecond(2);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//ilk veri yatay ikinci veri dikey scroll yapar


        waitForSecond(2);
        //sayfanin en ustune scroll yapalim
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

    }

/*
         js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); kodu ile specific olarak bir webelemente scroll yapmadigimiz icin arguments degil
         window ile baslattik ve scrollTo methodu ile x ve ya koordinati belirttik
         X ==> 0 degerini aldigi icin yatay eksende kaydirma yapmaz
         y ==>document.body.scrollHeight kodunu yazdigimiz icin dynamic olarak sayfanin en altina scroll yapar
         */

    @Test
    public void test04() {

        //techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //Sayfanin en altina scroll yapalim
        jsScrollToEnd();

        waitForSecond(2);

        //sayfanin en ustune scroll yapalim
        jsScrollToHome();
    }








}
