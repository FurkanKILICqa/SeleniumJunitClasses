package day_12_files_seleniumWait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C03UploadFile extends TestBase {

    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
       WebElement coosFile = driver.findElement(By.id("file-upload"));

        //Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";

        coosFile.sendKeys(dosyaYolu);

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();

        //"File Uploaded!" textinin goruntulendigini test edelim.
       String ActualTest = driver.findElement(By.xpath("//h3")).getText();

       Assert.assertEquals("File Uploaded!",ActualTest);


    }
}
