package com.testinium.pages;

import com.testinium.methods.Method;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Method method;

    public ProductPage(){
        method = new Method();
    }

    public void selectProduct(){
        method.sendKeys(By.id("search-input"),"Oyuncak");
        method.click(By.cssSelector(".common-sprite.button-search"));
        method.waitBySeconds(1);
        method.scrollWithAction(By.xpath("(//div[@class='grid_7 omega'])[7]"));
        method.waitBySeconds(2);

        method.click(By.xpath("(//a[@class='add-to-favorites'])[6]"));
        method.click(By.xpath("(//a[@class='add-to-favorites'])[7]"));
        method.click(By.xpath("(//a[@class='add-to-favorites'])[8]"));
        method.click(By.xpath("(//a[@class='add-to-favorites'])[9]"));

        method.click(By.cssSelector(".logo-text"));
        method.waitBySeconds(2);
    }


}
