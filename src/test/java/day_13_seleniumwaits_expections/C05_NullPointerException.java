package day_13_seleniumwaits_expections;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_NullPointerException {
Faker faker;

    /*
    NullPointerException
    Eger bir obje yada variable olusturup bu olusturdugumuz obje yada variable a assignment yapmadan kullanmak istersekb
         bu exception u aliriz
         henuz olusturulmamis degeri null olan bir obje uzerinde islem yapmaya kalktigimizda bu hatayi aliriz
         */

    @Test
    public void test01() {

        faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());


    }

}
