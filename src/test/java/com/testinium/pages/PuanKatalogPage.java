package com.testinium.pages;

import com.testinium.methods.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PuanKatalogPage {
    Method method;

    public PuanKatalogPage(){
        method = new Method();
    }

    public void katalogaGit(){

        method.click(By.cssSelector(".lvl1catalog>a"));
        method.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        method.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
    }

    public Select selectOption(){
        return method.getSelect(By.cssSelector(".sort>select"));
    }

    public void siralamaYap(){
        selectOption().selectByVisibleText("Yüksek Oylama");
    }

}
