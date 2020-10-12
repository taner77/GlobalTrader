package com.glb_trader.tests;

import com.glb_trader.pages.Gr5_Page;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gr5_Test extends TestBase {


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
        gr5_page.minPrice.click();
        gr5_page.maxPrice.click();

    }


}
