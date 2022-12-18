package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.*;
import org.junit.Test;

public class KartBilgileriTest extends BaseTest {

    @Test
    public void odemeTamamla(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        HobiKitaplariPage hobiKitaplariPage = new HobiKitaplariPage();
        hobiKitaplariPage.hobiSayfasınaGit();
        hobiKitaplariPage.randomKitapSec();

        SepetPage sepetPage = new SepetPage();
        sepetPage.sepetOzet();

        KargoAdresiPage kargoAdresiPage = new KargoAdresiPage();
        kargoAdresiPage.bilgiDoldur();

        KartBilgileriPage kartBilgileriPage = new KartBilgileriPage();
        kartBilgileriPage.kartBilgileri();
    }

}
