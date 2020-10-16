package com.glb_trader.tests;

import com.glb_trader.pages.GR9_Page09;
import com.glb_trader.utilities.ReusableMethods;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GR9_Test09 extends TestBase {


    GR9_Page09 gr9_page09=new GR9_Page09();
    @Test
    public void menClothingShirtTest() throws InterruptedException {
        gr9_page09.searchBox.sendKeys("shirt");
        Select select = new Select(gr9_page09.dropdown);
        select.selectByValue("1");
        gr9_page09.searchButton.click();
        ReusableMethods.waitForVisibility(gr9_page09.shirtText,10);
        Assert.assertTrue(gr9_page09.shirtText.isDisplayed());

    }

    @Test
    public void consumerElectronicTest(){
        gr9_page09.searchBox.sendKeys("camera");
        Select select = new Select(gr9_page09.dropdown);
        select.selectByValue("42");
        gr9_page09.searchButton.click();
        ReusableMethods.waitForVisibility(gr9_page09.cameraText,10);
        Assert.assertTrue(gr9_page09.cameraText.isDisplayed());

    }


}