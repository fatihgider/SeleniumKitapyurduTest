package com.testinium.pages;

import com.testinium.methods.Method;
import org.openqa.selenium.By;

public class SepetPage {
    Method method;

    public SepetPage(){
        method = new Method();
    }


    public void sepetOzet(){
        method.waitBySeconds(1);
        method.findElement(By.xpath("//input[@name='quantity']")).clear();
        method.sendKeys(By.xpath("//input[@name='quantity']"),"3");
        method.waitBySeconds(1);
        method.click(By.xpath("//i[@title='Güncelle']"));
        method.waitBySeconds(1);
        method.click(By.xpath("//div[@class='right']/a"));
        method.waitBySeconds(5);
    }

}
