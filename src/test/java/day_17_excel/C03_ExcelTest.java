package day_17_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_ExcelTest extends TestBase {

    //https://www.bluerentalcars.com/ sayfasına gidelim
    //Login butonuna basalım
    //Excel dosyasından aldığımız bir kullanıcı adı ve password ile login olalim
    //Login olduğumuzu doğrulayalım


    @Test
    public void test01() throws IOException {


        driver.get("https://www.bluerentalcars.com/");


        driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm']")).click();

        String path = "C:\\Users\\hpvic\\IdeaProjects\\B189SeleniumJunitDT\\src\\test\\java\\resources\\mysmoketestdata.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);


       String userMail = workbook.getSheet("customer_info").getRow(1).getCell(0).toString();
       String userPass = workbook.getSheet("customer_info").getRow(1).getCell(1).toString();

        System.out.println(userMail+" "+userPass);

        WebElement mail = driver.findElement(By.xpath("//*[@id='formBasicEmail']"));
        WebElement pass = driver.findElement(By.xpath("//*[@id='formBasicPassword']"));

        mail.sendKeys(userMail);
        pass.sendKeys(userPass);
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();

       // String ayhan = driver.findElement(By.xpath("dropdown-basic-button")).getText();




















    }
}
