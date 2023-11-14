package day_12_files_seleniumWait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileDownload extends TestBase {



    //Dosyanın başarıyla indirilip indirilmediğini test edelim


    @Test
    public void downloadTest() {

        //https://testcenter.techproeducation.com/index.php?page=file-download adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        //b10 all test cases dosyasını indirelim
        driver.findElement(By.partialLinkText("b10 all test cases, code")).click();

        waitForSecond(5);


        //Dosyanın başarıyla indirilip indirilmediğini test edelim

        //C:\Users\mua       \Downloads\b10 all test cases, code.docx
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";

        Assert.assertTrue( Files.exists(Paths.get(dosyaYolu)));





    }
}
