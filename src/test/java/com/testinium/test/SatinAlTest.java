package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.HobiKitaplariPage;
import com.testinium.pages.LoginPage;
import com.testinium.pages.SepetPage;
import org.junit.Test;

public class SatinAlTest extends BaseTest {

    @Test
    public void sepet(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        HobiKitaplariPage hobiKitaplariPage = new HobiKitaplariPage();
        hobiKitaplariPage.hobiSayfasınaGit();
        hobiKitaplariPage.randomKitapSec();

        SepetPage sepetPage = new SepetPage();
        sepetPage.sepetOzet();
    }
}
