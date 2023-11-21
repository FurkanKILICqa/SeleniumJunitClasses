package day_17_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_ExcelTest extends TestBase {


    @Test
    public void test01() throws IOException {

        //https://www.bluerentalcars.com/ sayfasına gidelim
        driver.get("https://www.bluerentalcars.com/");

        //Login butonuna basalım
        driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm']")).click();

        String path = "C:\\Users\\hpvic\\IdeaProjects\\B189SeleniumJunitDT\\src\\test\\java\\resources\\mysmoketestdata.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);

        //Excel dosyasından aldığımız bir kullanıcı adı ve password ile login olalim
       String userMail = workbook.getSheet("customer_info").getRow(1).getCell(0).toString();
       String userPass = workbook.getSheet("customer_info").getRow(1).getCell(1).toString();

        System.out.println(userMail+" "+userPass);

        WebElement mail = driver.findElement(By.xpath("//*[@id='formBasicEmail']"));
        WebElement pass = driver.findElement(By.xpath("//*[@id='formBasicPassword']"));
        WebElement loginBox = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));

        mail.sendKeys(userMail);
        pass.sendKeys(userPass);
        loginBox.click();

        //Login olduğumuzu doğrulayalım
        WebElement loginTest = driver.findElement(By.id("dropdown-basic-button"));
        Assert.assertEquals("ayhan can",loginTest.getText());





















    }
}
