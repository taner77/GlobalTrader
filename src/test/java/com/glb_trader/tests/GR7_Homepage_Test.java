package com.glb_trader.tests;

import com.glb_trader.pages.GR7_Homepage_Page;
import com.glb_trader.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GR7_Homepage_Test extends TestBase {

    GR7_Homepage_Page gr7_homepage_page = new GR7_Homepage_Page();

    @Test
    public void gotoHomePage(){
        setupMethod();
        Assert.assertTrue(driver.getTitle().contains("Online Shopping Site for Mobiles, Fashion, Books"));
    }

    @Test
    public void listMyProduct(){
        gr7_homepage_page.listmyproduct1.click();
        Assert.assertTrue(gr7_homepage_page.listmyproduct2.getText().equals("How Can I list my products in Glbtrader.com?"));
    }



}
