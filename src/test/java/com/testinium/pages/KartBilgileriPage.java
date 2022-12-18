package com.testinium.pages;

import com.testinium.methods.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class KartBilgileriPage {

    Method method;

    public KartBilgileriPage(){
        method = new Method();
    }

    public Select sonKullanmaAy(){
        return method.getSelect(By.id("credit-card-expire-date-month"));
    }
    public Select sonKullanmaYil(){
        return method.getSelect(By.id("credit-card-expire-date-year"));
    }
    public void selectDoldur(){
        sonKullanmaAy().selectByVisibleText("04");
        method.waitBySeconds(1);
        sonKullanmaYil().selectByVisibleText("2024");
    }

    public void kartBilgileri(){
        method.sendKeys(By.id("credit-card-owner"),"Hasan Hüseyin");
        method.sendKeys(By.id("credit_card_number_1"),"4444");
        method.sendKeys(By.id("credit_card_number_2"),"4444");
        method.sendKeys(By.id("credit_card_number_3"),"4444");
        method.sendKeys(By.id("credit_card_number_4"),"4444");
        method.waitBySeconds(1);
        selectDoldur();
        method.sendKeys(By.id("credit-card-security-code"),"123");

        method.waitBySeconds(1);
        method.click(By.id("button-checkout-continue"));

        method.waitBySeconds(2);

    }

}
