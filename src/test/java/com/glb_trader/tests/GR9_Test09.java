package com.glb_trader.tests;

import com.glb_trader.pages.GR9_Page09;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GR9_Test09 extends TestBase {


    //1-Go to the homepage
//2- Type "shirt" in the search box
//3-Select the "Men clothing & accessories" categories
//4-Click the search button (magnifying glass)
//5- Verfy the result of search

    GR9_Page09 gr9_page09=new GR9_Page09();
    @Test
    public void menClothingShirtTest() throws InterruptedException {


        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr9_page09.searchBox.sendKeys("shirt");
        Select select = new Select(gr9_page09.dropdown);
        select.selectByValue("1");
        gr9_page09.searchButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(gr9_page09.shirtText));
        Assert.assertTrue(gr9_page09.shirtText.isDisplayed());


    }
    //1-Go to the homepage
    //2- Type "camera" in the search box
    //3-Select the "Consumer electronics" categories
    //4-Click the search button (magnifying glass)
    //5- Verfy the result of search

    @Test
    public void consumerElectronicTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr9_page09.searchBox.sendKeys("camera");
        Select select = new Select(gr9_page09.dropdown);
        select.selectByValue("42");
        gr9_page09.searchButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(gr9_page09.cameraText));
        Assert.assertTrue(gr9_page09.cameraText.isDisplayed());

    }


}