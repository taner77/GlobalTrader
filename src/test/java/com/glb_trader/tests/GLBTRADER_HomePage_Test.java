package com.glb_trader.tests;


import com.glb_trader.pages.GLBTRADER_HomePage;
import com.glb_trader.utilities.ConfigReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GLBTRADER_HomePage_Test extends TestBase {

    @Test
    public void glbTraderHomePageTest() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_url"));
        GLBTRADER_HomePage glbtrader_homePage = new GLBTRADER_HomePage();
        glbtrader_homePage.Seller_Join_Now.click();
        glbtrader_homePage.company_name.sendKeys(ConfigReader.getProperty("glb_company_name"));
        glbtrader_homePage.company_mobile.sendKeys(ConfigReader.getProperty("company_mobile"));
        glbtrader_homePage.company_address.sendKeys(ConfigReader.getProperty("company_address"));
        glbtrader_homePage.sellerName.sendKeys(ConfigReader.getProperty("sellerName"));
        glbtrader_homePage.sellerEmail.sendKeys(ConfigReader.getProperty("sellerEmail"));
        glbtrader_homePage.sellerWebSiteAddress.sendKeys(ConfigReader.getProperty("sellerWebSiteAddress"));
        glbtrader_homePage.sellerMobilPhone.sendKeys(ConfigReader.getProperty("sellerMobilPhone"));

        Select select1 = new Select(glbtrader_homePage.country);
        select1.selectByIndex(2);

        glbtrader_homePage.state.sendKeys(ConfigReader.getProperty("state"));
        glbtrader_homePage.city.sendKeys(ConfigReader.getProperty("city"));
        glbtrader_homePage.address.sendKeys(ConfigReader.getProperty("address"));
        glbtrader_homePage.postalCode.sendKeys(ConfigReader.getProperty("postalCode"));

        Select select2 = new Select(glbtrader_homePage.category);
        select2.selectByIndex(2);
        glbtrader_homePage.password.sendKeys(ConfigReader.getProperty("password"));
        glbtrader_homePage.registration.click();


        String actualTitle = glbtrader_homePage.registrationText.getText();
        String expectedTitle = "Thank you to join our team. You are Registered Successfully.";
        Assert.assertEquals(actualTitle,expectedTitle);



    }

}
