package com.testinium.pages;

import com.testinium.methods.Method;
import org.openqa.selenium.By;

public class FavorilerPage {

    Method method;

    public FavorilerPage(){
        method = new Method();
    }

    public void favorilereGit(){
        method.click(By.xpath("(//a[@class='common-sprite'])[2]"));
        method.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
    }

    public void favorilerdenKaldir(){

        method.scrollWithAction(By.cssSelector(".results"));
        method.waitBySeconds(3);
        method.click(By.xpath("(//div[@class='product-cr'])[3]/div[@class='grid_2 alpha omega relative']/div[@class='hover-menu']/a[@data-title='Favorilerimden Sil']"));
        method.waitBySeconds(3);
    }

}
