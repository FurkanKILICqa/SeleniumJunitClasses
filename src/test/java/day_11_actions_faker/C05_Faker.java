package day_11_actions_faker;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class C05_Faker  {





    //faker objesi ile fake bir email yazdırınız
    //faker objesi ile fake bir rastgele 15 haneli bir sayi yazdırınız
    //faker objesi ile fake bir isimsoyisim yazdırınız


    @Test
    public void test01() {

        Faker faker = new Faker();

        //faker objesi ile fake bir isim yazdırınız
       String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);


        //faker objesi ile fake bir soyisim yazdırınız
        System.out.println("LastName = " + faker.name().lastName());

        //faker objesi ile fake bir adress yazdırınız
        System.out.println("FullAddress = " + faker.address().fullAddress());

        //faker objesi ile fake bir telefon No yazdırınız
        System.out.println("CellPhone = " + faker.phoneNumber().cellPhone());




    }


}
