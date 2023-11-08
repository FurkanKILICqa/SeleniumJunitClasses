package day06_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CheckBox {

    WebDriver driver;

    /*
   Verilen web sayfasına gidin.
           https://the-internet.herokuapp.com/checkboxes
           .
           Checkbox1 seçili değilse onay kutusunu tıklayın
           Checkbox2 seçili değilse onay kutusunu tıklayın

    */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Testler Çalışmaya Başladı");
    }


    @Before
    public void setUp() throws Exception {//Her testten önce hazır olmasını istediklerimiz
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        }


    @Test
    public void checkBox() throws InterruptedException {
       //Checkbox1 ve checkbox2 elementlerini locate edin
      WebElement checkBox01 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
      WebElement checkBox02 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Thread.sleep(3000);


      //Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!checkBox01.isSelected()){
            checkBox01.click();
        }

        if (!checkBox02.isSelected()){
            checkBox02.click();
        }
        Thread.sleep(3000);
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }















}