package day_11_actions_faker;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_ActionsTest extends TestBase {


    @Test
    public void test01() {
        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        frameindex(0);//TestBase Classında oluşturduğun reusable method sayesinde iframe e geçiş yaptık

        WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));

        WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();

    }

    @Test
    public void test02() {

        //Ikinci yol

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        frameindex(0);

        WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));

        WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).moveToElement(drop).release().perform();



    }

    @Test
    public void test03() {
        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        frameindex(0);

        WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));

        WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).moveByOffset(185,48).release(drop).perform();
    }

    //Homework Drog webelementinin drop webelemenitinin uzerine birakildigini dogrulayin







}
