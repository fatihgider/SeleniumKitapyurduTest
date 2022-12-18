package com.testinium.pages;

import com.testinium.methods.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class KargoAdresiPage {

    Method method;

    public KargoAdresiPage(){
        method = new Method();
    }

    public Select sehirSec(){
        return method.getSelect(By.id("address-zone-id"));
    }
    public Select ilceSec(){
        return method.getSelect(By.id("address-county-id"));
    }
    public void selectDoldur(){
        sehirSec().selectByVisibleText("İstanbul");
        method.waitBySeconds(1);
        ilceSec().selectByVisibleText("PENDİK");
    }

    public void bilgiDoldur(){
        /*
        method.sendKeys(By.id("address-firstname-companyname"),"Fatih");
        method.sendKeys(By.id("address-lastname-title"),"Gider");
        selectDoldur();
        method.waitBySeconds(2);
        method.sendKeys(By.id("district"),"KURTKÖY MAH");
        method.waitBySeconds(2);
        method.click(By.xpath("//div[@id='districtautocomplete-list']/div"));
        method.waitBySeconds(2);
        method.sendKeys(By.id("address-address-text"),"Safa cad. Eftelya sok. Mesken konutları D-4 blok daire 29");
        method.sendKeys(By.id("address-postcode"),"34500");
        method.sendKeys(By.id("address-mobile-telephone"),"5368429232");
        method.sendKeys(By.id("address-tax-id"),"28003202108");
        method.click(By.id("button-checkout-continue"));

        method.waitBySeconds(3);
        */

        method.click(By.id("button-checkout-continue"));
        method.waitBySeconds(4);
        method.click(By.id("button-checkout-continue"));
        method.waitBySeconds(4);
    }


}
