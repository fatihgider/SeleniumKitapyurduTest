package com.testinium.pages;

import com.testinium.methods.Method;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Method method;

    public LoginPage(){
        method = new Method();
    }

    public void login(){
        method.click(By.cssSelector(".menu-top-button.login>a"));
        method.scrollWithAction(By.cssSelector(".app-wr"));
        method.sendKeys(By.id("login-email"),"fatih.gider@outlook.com");
        method.sendKeys(By.xpath("//input[@id='login-password']"),"admin123");
        method.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        method.waitBySeconds(15);
        Assert.assertTrue("Login Failed!",method.isElementVisibles(By.cssSelector(".section")));
    }

}
