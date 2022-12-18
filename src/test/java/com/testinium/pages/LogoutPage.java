package com.testinium.pages;

import com.testinium.methods.Method;
import org.openqa.selenium.By;

public class LogoutPage {
    Method method;

    public LogoutPage(){
        method = new Method();
    }

    public void logout(){
        method.waitBySeconds(1);
        method.click(By.cssSelector(".checkout-logo>img"));
        method.waitBySeconds(2);
        method.moveToElement(By.xpath("(//a[@class='common-sprite'])[1]"));
        method.waitBySeconds(2);
        method.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/logout']"));

        method.waitBySeconds(2);

    }

}
