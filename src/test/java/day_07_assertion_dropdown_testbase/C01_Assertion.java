package day_07_assertion_dropdown_testbase;

import org.junit.Assert;
import org.junit.Test;

public class C01_Assertion {
/*
    Assertion, bir test sirasinda beklenen (expected) ve gercek (actual) sonuclar arasindaki uyumu dogrulamak icin kullanilir
    Eger beklenen sonuc gerceklesen sonuc ile uyusmuyorsa assertion exception firlatilir ve test failed(basarisiz) olur
    Junit te bir assertion basarisiz oldugunda o anda calismakta olan test methodu durdurulur, ve bir assertionError firlatiliry
    Bu iligili testin basarisiz oldugu anlamina gelir
    Ancak test sinifi icindeki diger test methodlari bu durumdan etkilenmez ve kendi icindeki assertionlar basarisizi olmadikca
    calismaya devam ederler
     */



    //1. assertEquals(expected, actual): parantezi icinde belirtilen iki degerin esit olup olmadigini kontrol eder
    //esitse test basarili olur degilse basarisiz olur
    @Test
    public void test01() {
        String ecceptedData = "selenium";
        String actualData = "selenium";
        Assert.assertEquals(ecceptedData,actualData);//Bir static method dur nokta koyarak ulaştık
    }


    //2. assertTrue(boolean); parantezi icinde belirtilen kosulun dogru olup olmadigini kontrol eder, eger parantez icindeki deger
    //true ise test basarili olur, degilse basarisiz olur

    @Test
    public void test2() {
        Assert.assertTrue("selenium".contains("e"));

    }

    //3. assertFalse(boolean); parantezi icinde belirtilen kosulun yanlis olup olmadigini kontrol eder, eger parantez icindeki deger
    // false ise test basarili olur, degilse basarisiz olur
    //Bir test methodu içinde 2 testten biri kalırsa test fail olur ve çalışmayı durdurur

    @Test
    public void tesst03() {
        Assert.assertFalse("JAVA".contains("E"));//PASS
        Assert.assertFalse("SELENİUM".contains("E"));//FAIL
        System.out.println("test03 method içi calisma durdu");

    }

    //4. assertNotEquals(expected, actual) : icerisinde belirtilen parametreler
    // esit degilse test basarili olur esit ise test basarisiz olur

    @Test
    public void test04() {
        Assert.assertNotEquals("SELENIUM","JAVA");//Pass
        Assert.assertNotEquals("SELENIUM","SELENIUM");//Fail

    }













}
