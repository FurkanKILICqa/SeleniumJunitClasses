package day_19_jsexecutor_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class C02_Log4j {

    /*
    1-Log4j kullanabilmek icin oncelikle Log4j-core ve log4j-api dependencyleri pom xml dosyasina ekleriz
    2-project seviyesinde birtane log4jxml dosyasi olusturup configurasyon icin xml kodlarini bu dosyaya ekleriz

     */


    @Test
    public void test01() {

        //  LogManager.getLogger(C02_Log4j.class); kodu parantez icinde belirtilen class
        //  icin bir tane Logger(loglayici) objecti olusturur
       Logger loger = LogManager.getLogger(C02_Log4j.class);
        loger.info("Amazon web sayfasina gidildi");
        loger.info("arama kutusu locate edildi");
        loger.info("arama kutusunda selenium aratildi");


    }
}
