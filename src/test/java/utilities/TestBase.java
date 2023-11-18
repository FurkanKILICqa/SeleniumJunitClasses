package utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBase {
    //Tekrarlardan kurtulmalıyız
    //Erişimimümkün olan en az erişim olmalıdır işimizi gören en dar kapsamlı olan olmalıdır güvenlik için
    //Abstract yaparsak override zorunlu olur, astract class lardan obje oluşturulamaz
    //Bu class dan obje oluşturulmasını istemediğimiz için abstract oluşturduk
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }



    //Select Visible test Dropdown
    public void selectVisible(WebElement ddm, String option){
        Select selectYear = new Select(ddm);
        selectYear.selectByVisibleText(option);

    }

    //Select index DropDown
    public void selectIndex(WebElement ddm, int index){
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //Hard Wait
    public void waitForSecond(int second)  {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //window handle
    public void window(int index){
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());

    }

    //iframe handle
    public void frameindex(int index){

        driver.switchTo().frame(index);
    }

    //screenShot
    public void screenShot(){
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format( LocalDateTime.now() );

        String dosyaYolu="src\\test\\java\\screenShots\\"+date+"screenShot.png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        try {
            Files.write(Paths.get(dosyaYolu), ts.getScreenshotAs(OutputType.BYTES));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

        //WebElementScreenShot
        public void acreenShotOfWebElement(WebElement webElement){
            String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format( LocalDateTime.now() );

            String dosyaYolu="src\\test\\java\\screenShots\\"+date+"webElementSS.png";

            try {
                Files.write(  Paths.get(dosyaYolu) , webElement.getScreenshotAs(OutputType.BYTES) );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }






    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
       // driver.quit();
    }











}
