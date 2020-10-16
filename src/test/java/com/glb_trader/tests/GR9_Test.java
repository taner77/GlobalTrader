package com.glb_trader.tests;

import com.glb_trader.pages.GR9_page;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class GR9_Test extends TestBase {

    GR9_page gr9_page = new GR9_page();

    @BeforeMethod
    public void login() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr9_page.searchBox.sendKeys("ipad");
        gr9_page.searchButton.click();
        Select select = new Select(gr9_page.dropdown);
        select.selectByValue("41");
    }

    @Test
    public void catagories() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(gr9_page.appleTablet));
        Assert.assertTrue(gr9_page.appleTablet.isDisplayed());

    }

    @Test
    public void minPriceTest() {

        gr9_page.minPrice.click();
        List<Integer> minPrices = new ArrayList<>();

        for (WebElement w : gr9_page.minPriceList) {
            System.out.print("Min price List: " + w.getText());
            Integer integerPrice = Integer.parseInt(w.getText());
            minPrices.add(integerPrice);
        }

        for (int i = 0; i < minPrices.size() - 1; i++) {
            Assert.assertTrue(minPrices.get(i) <= minPrices.get(i + 1));
        }
    }

    @Test
    public void maxPriceTest() {
        gr9_page.maxPrice.click();
        List<Integer> maxPrice = new ArrayList<>();
        for (WebElement w : gr9_page.maxPriceList) {
            System.out.println("Max price list; " + w.getText());
            Integer integerMaxPrice = Integer.parseInt((w.getText()));
            maxPrice.add(integerMaxPrice);
        }
        for (int i = maxPrice.size() - 1; i >= 0; i--) {
            Assert.assertTrue(maxPrice.get(i) >= maxPrice.get(i + 1));
        }


    }
}
