package day_11_actions_faker;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

import java.util.Locale;

public class C05_Faker  {

    //Locale locale = new Locale("tr");
    //Faker faker1 = new Faker(locale);
    //System.out.println("faker1.name().firstName() = " + faker1.name().firstName());





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

        //faker objesi ile fake bir email yazdırınız
        System.out.println("EmailAddress = " + faker.internet().emailAddress());

        //faker objesi ile fake bir rastgele 15 haneli bir sayi yazdırınız
        System.out.println("Digits = " + faker.number().digits(15));//String verir integer değil !!

        //faker objesi ile fake bir isimsoyisim yazdırınız
        System.out.println("FullName = " + faker.name().fullName());

    }

    @Test
    public void test02() {

        Locale locale = new Locale("tr");
        Faker faker1 = new Faker(locale);
        System.out.println("faker1.name().firstName() = " + faker1.name().firstName());


    }
}
