package com.glb_trader.tests;

import com.glb_trader.pages.Gr5_Page;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gr5_Test extends TestBase {

    Actions actions;
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    Gr5_Page gr5_page=new Gr5_Page();

    @Test
    public void tc01(){
    Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));

        gr5_page.manClothing.click();
        gr5_page.tshirt.click();

       // gr5_page.maxPrice.click();

    }
    @Test
    public void tc02(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr5_page.manClothing.click();
        gr5_page.tshirt.click();
        gr5_page.minPrice.click();

        //String message = gr5_page.sortByMin.getText();
       // Assert.assertTrue(message.contains("1"));

    }
    @Test
    public void tc03() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr5_page.manClothing.click();
        gr5_page.tshirt.click();
        gr5_page.maxPrice.click();
    }
    @Test
    public void tc04() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr5_page.manClothing.click();
        gr5_page.tshirt.click();
        actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(gr5_page.size.getText().equals("Size"));

    }

    @Test
    public void tc05() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr5_page.manClothing.click();
        gr5_page.tshirt.click();
        actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(gr5_page.brand.getText().equals("Brand"));

    }

    @Test
    public void tc06() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr5_page.manClothing.click();
        gr5_page.tshirt.click();
        actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(gr5_page.applicablePeople.getText().equals("Applicable People"));

    }

    @Test
    public void tc07() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_trader_url"));
        gr5_page.manClothing.click();
        gr5_page.tshirt.click();
        actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(gr5_page.applicableSort1.getText().equals("Unisex"));
        Assert.assertTrue(gr5_page.applicableSort2.getText().equals("Male"));

    }



}
