package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.FavorilerPage;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class FavorilerTest extends BaseTest {

    @Test
    public void urunSil(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ProductPage productPage = new ProductPage();
        productPage.selectProduct();

        FavorilerPage favorilerPage = new FavorilerPage();
        favorilerPage.favorilereGit();
        favorilerPage.favorilerdenKaldir();
    }

}
