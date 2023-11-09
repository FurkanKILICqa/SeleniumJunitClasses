package day_09_iframe_windowhandle_basicauthentication;

import org.junit.Test;
import utilities.TestBase;

public class C04_BasicAuthentication extends TestBase {

    //Aşağıdaki bilgileri kullanarak authentication yapınız:
    //    Url: https://the-internet.herokuapp.com/basic_auth
    //    Username: admin
    //    Password: admin
    //    Congratulations! You must have the proper credentials. yazının çıktığını doğrulayın
    //Elemental Selenium linkine tıklayınız
    //Başlığın Elemental Selenium içerdiğini test edelim


    @Test
    public void test01() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");




    }
}
