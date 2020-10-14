package com.glb_trader.tests;

import com.glb_trader.pages.GR9_page;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GR9_Test extends TestBase {
    //1-Go to the homepage
    //2- Type "ipad" in the search box
    //3-Select the "Computer&Office" categories
    //4-Click the search button (magnifying glass)
    //5- Verfy the result of search

    GR9_page gr9_page = new GR9_page();
    @Test
    public void categories() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr9_page.searchBox.sendKeys("ipad");
        gr9_page.searchButton.click();
        Select select = new Select(gr9_page.dropdown);
        select.selectByValue("41");
        WebDriverWait wait = new WebDriverWait(driver,20 );
        wait.until(ExpectedConditions.visibilityOf( gr9_page.appleTablet));
       Assert.assertTrue(gr9_page.appleTablet.isDisplayed());

    }
}
