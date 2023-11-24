package day_07_assertion_dropdown_testbase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03_DropdownManu {

    WebDriver driver;

    /*
    Dropdown --> Altbasliklarin oldugu acilir menu listesidir. Dropdown u automate etmek icin
    1- Drowdown menuyu locate edeceğiz
    2- Select objesi olustururuz
    3- Select objesini kullanarak  bazi methodlar ile istedigimiz seceneğe erisim saglariz
     SYNTAX
     Select select = new Select(Dropdown webelement)
        a- selectByVisibleText() ->  Dropdown menudeki elemente gorunen metin ile ulasmak icin kullanilir
        b- selectByIndex() -> Index ile ulasmak icin kullanilir (index 0 (sifir) dan baslar)
        c- selectByValue() -> value attribute deegeri ile ulasmak icin kullanilir (option tagi ile baslar)
    4- getOptions() -> Locate ettigimiz dropdown menu deki tum secenekleri bize verir
    5- getFirstSelectedOption() -> Dropdown menudeki secili olan seceneği bize verir
     */

    /*
   Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
   -3 farklı test methodu oluşturalım
       1.Method:
           a. Yil,ay,gün dropdown menu'leri locate ediniz
           b. Select objesi olustur
           c. Select object i kullaarak 3 farkli sekilde secim yapiniz
       2.Method:
           a. Tüm eyalet isimlerini yazdıralım
       3.Method:
           a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim

    */

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    }


    @Test
    public void tst01() {
        //a. Yil,ay,gün dropdown menu'leri locate ediniz //select[@id='year']
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        WebElement mount = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

        //b. Select objesi olustur
        Select selectYear = new Select(year);
        Select selectMount = new Select(mount);
        Select selectDay = new Select(day);


        //c. Select object i kullaarak 3 farkli sekilde secim yapiniz
        selectYear.selectByIndex(5);//Indexler 0 dan başlar
        selectMount.selectByValue("4");
        selectDay.selectByVisibleText("26");


    }

    @Test
    public void test02() {
        //a. Tüm eyalet isimlerini yazdıralım //*[@id='state']
        WebElement statesDropdown = driver.findElement(By.xpath("//*[@id='state']"));

        Select select = new Select(statesDropdown);
        List<WebElement> listOfStates = select.getOptions();//All states

      // for (WebElement w : listOfStates) {

      //     System.out.println(w.getText());

      // }

        //ikinci yol lambda ile
        listOfStates.forEach(t-> System.out.println(t.getText()));

    }

    //Üçüncü yol
    @Test
    public void test03() {
        List<WebElement> listOfStates =  driver.findElements(By.xpath("//*[@id='state']/option"));
        listOfStates.forEach(t-> System.out.println(t.getText()));
    }



    @Test
    public void test04() {
        //a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
        WebElement statesDropdown = driver.findElement(By.xpath("//*[@id='state']"));

        Select select = new Select(statesDropdown);

        String actualOption = select.getFirstSelectedOption().getText();//İlk seçili olanı verir
        String accepdenOption = "Select a State";
        System.out.println("actualOption = " + actualOption);

        Assert.assertEquals(actualOption,accepdenOption);

    }

    @Test
    public void test05() {
        //genelde dropdown webelementine sendKeys() methodu ile seceneklerden bir tanesini göndererek te secim yapabiliriz
        WebElement statesDropdown = driver.findElement(By.xpath("//*[@id='state']"));
        statesDropdown.sendKeys("Alabama");//Bu her zaman geçerli olmayabilir
    }




    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        //driver.close();
    }









}
