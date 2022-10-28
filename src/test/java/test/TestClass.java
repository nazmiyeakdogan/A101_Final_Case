package test;

import logger.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Metods;
import pages.WebElements;
import utils.GWD;

import java.util.Set;

public class TestClass extends GWD {

    WebElements element = new WebElements();
    Metods m = new Metods();


    @Test(priority = 1)
    public void test1(){
        Log.info("hepsiburada sitesine gidildi");
        m.action(element.login1);
        element.click("login2");
        element.click("cookie1");
        Log.info("cookie kabul edildi.");
        element.send("email", "akdoganflow@gmail.com");
        Log.info("email adresi girildi");
        element.click("login3");
        element.send("sifre", "Akdogan123");
        Log.info("şifre girildi");
        element.click("login4");
        Log.info("kullanıcı girişi yapıldı");
        element.check("pageValidation", "Nazmiye");
        Log.info("kullanıcı girişi doğrulandı");
        element.send("searchBox","çanta");
        element.click("ara");
        Log.info("ürün aratıldı");
        element.click("canta");
        Log.info("ürün seçildi");
        Set<String> window= driver.getWindowHandles();
        for (String i : window){
            driver.switchTo().window(i);
        }
        element.click("addToCart1");
        Log.info("ürün sepete eklendi");
        element.click("closeButton");
        element.click("addToCart2");
        Log.info("farklı satıcıdan ürün sepete eklendi ");
        element.click("basket");
        Log.info("sepete gidildi");
        Assert.assertTrue(element.checked1.getText().contains("LRsmile Tavşan Detaylı Çanta"));
        Log.info("doğru ürün eklendiği kontrol edildi");
    }

    @Test(priority = 2)
    public void test2(){
        driver.get("https://www.hepsiburada.com/");
        Log.info("hepsiburada sitesine gidildi");
        element.send("searchBox","termos");
        element.click("ara");
        Log.info("ürün aratıldı");
        element.click("termos");
        Log.info("ürün seçildi");

        Set<String> window= driver.getWindowHandles();
        for (String i : window){
            driver.switchTo().window(i);
        }
        element.click("addToCart1");
        Log.info("ürün sepete eklendi");
        element.click("closeButton");
        element.click("addToCart2");
        Log.info("farklı satıcıdan ürün sepete eklendi ");
        element.click("basket");
        Log.info("sepete gidildi");
        Assert.assertTrue(element.checked2.getText().contains("Stanley Klasik Trigger Action Seyahat Bardağı"));
        Log.info("doğru ürün eklendiği kontrol edildi");
    }
}
