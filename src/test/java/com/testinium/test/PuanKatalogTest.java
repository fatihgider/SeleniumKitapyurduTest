package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.PuanKatalogPage;
import org.junit.Test;

public class PuanKatalogTest extends BaseTest {

    @Test
    public void puanliTurkKlasikleri(){

        PuanKatalogPage puanKatalogPage = new PuanKatalogPage();
        puanKatalogPage.katalogaGit();
        puanKatalogPage.siralamaYap();

    }

}
