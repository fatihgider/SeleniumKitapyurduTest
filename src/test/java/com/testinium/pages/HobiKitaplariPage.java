package com.testinium.pages;

import com.testinium.methods.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class HobiKitaplariPage {
    Method method;

    public HobiKitaplariPage(){
        method = new Method();
    }

    public void hobiSayfasınaGit(){
        method.click(By.xpath("//li[@class='has-open-menu'][3]"));
        method.waitBySeconds(1);
        method.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html']"));
        method.waitBySeconds(3);
    }

    public void randomKitapSec(){
        method.scrollWithAction(By.xpath("(//div[@class='notice-container'])[10]"));

        WebElement kitaplar = method.findElement(By.xpath("(//div[@class='box no-padding']/div)[2]"));
        List<WebElement> e = kitaplar.findElements(By.tagName("img"));
        Random r=new Random();
        e.get(r.nextInt(10)).click();

        method.scrollWithAction(By.id("button-cart"));
        method.click(By.id("button-cart"));

        method.click(By.id("cart-items"));
        method.waitBySeconds(2);
        method.click(By.id("js-cart"));

    }
}
