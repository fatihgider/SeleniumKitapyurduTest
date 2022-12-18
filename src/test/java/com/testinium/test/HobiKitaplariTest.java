package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.HobiKitaplariPage;
import org.junit.Test;


public class HobiKitaplariTest extends BaseTest {
    @Test
    public void randomKitap(){
        HobiKitaplariPage hobiKitaplariPage = new HobiKitaplariPage();

        hobiKitaplariPage.hobiSayfasınaGit();
        hobiKitaplariPage.randomKitapSec();
    }

}
