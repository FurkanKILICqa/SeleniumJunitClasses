package day_15_screenShots_extentdreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_ExtentReportTest {

    ExtentReports extentReports;//raporlamayi baslatir

    ExtentHtmlReporter extentHtmlReporter;//html formatinda rapor olusuturur

    ExtentTest extentTest; // Test adimlarina bilgi ekler


    @Test
    public void test01() {

        //bu object i raporlari olusturmak ve yonetmek icin kullanacacğız
        extentReports = new ExtentReports();

        //Oncelikle olusturmak istedigimiz html reprotu projemizde nerede saklamak istiyorsak bir dosya yolu olusturmaliyiz
        //cunku bu pathi kullanarak bir tane html report olusturacağız
        //bunun icinde ExtentHtmlReporter classindan bir object olusturmaliyiz

        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String path = "target/extentReport/" + date + "htmlReport.html";
        extentHtmlReporter = new ExtentHtmlReporter(path);

        //ExtentReports a Html raporlayiciyi ekler, bu raporun html formatinda olusturulmasini saglar
        extentReports.attachReporter(extentHtmlReporter);


        //Html raporunun belge basligini ayarlar, bu baslik sekme uzerinde görünür
        extentHtmlReporter.config().setDocumentTitle("Batch 189 Test Reports");

        //Raporun adini ayarladik, Bu raporda gorunecek olan genel baslik
        extentHtmlReporter.config().setReportName("Smoke Test");

        //Bu html raporunda görmek isteyebileceğimiz herhangi bir bilgiyi asagidaki formatta ekleyebilirz
        extentReports.setSystemInfo("Enviroment", "QA");
        extentReports.setSystemInfo("Bowser", "Chrome");
        extentReports.setSystemInfo("Test Automation Engineer", "Kadir Furkan Kilic");

        //"AmazonTest" adinda yeni bir test olusturur ve bu testin aciklamasi olarak "Test Report" ekler
        extentTest = extentReports.createTest("YechProEducationTest", "Test Report");


        //==========Buraya kadar sablon ayarlamalari bitt==================================
        //Bundan sonra extentTest objecti ile log rapara detayli islemleri ekleme islemleri yapacağız






    }
}
