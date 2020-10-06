package com.glb_trader.tests;

import com.glb_trader.pages.GR3_CSellerRegPage;
import com.glb_trader.utilities.ConfigReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GR3_CSellerReg_Test_TC002 extends TestBase {
    @Test
    public void glbTraderHomePageTest() {
        driver.get(ConfigReader.getProperty("glb_url"));
        GR3_CSellerRegPage gr3_homePage = new GR3_CSellerRegPage();
        gr3_homePage.Seller_Join_Now.click();
        gr3_homePage.company_name.sendKeys(ConfigReader.getProperty("glb_company_name"));
        gr3_homePage.company_mobile.sendKeys(ConfigReader.getProperty("company_mobile"));
        gr3_homePage.company_address.sendKeys(ConfigReader.getProperty("company_address"));
        gr3_homePage.sellerName.sendKeys(ConfigReader.getProperty("sellerName"));
        gr3_homePage.sellerEmail.sendKeys(ConfigReader.getProperty("sellerEmail"));
        gr3_homePage.sellerWebSiteAddress.sendKeys(ConfigReader.getProperty("sellerWebSiteAddress"));
        gr3_homePage.sellerMobilPhone.sendKeys(ConfigReader.getProperty("sellerMobilPhone"));

//        Select select1 = new Select(gr3_homePage.country);
//        select1.selectByIndex(2);

        gr3_homePage.state.sendKeys(ConfigReader.getProperty("state"));
        gr3_homePage.city.sendKeys(ConfigReader.getProperty("city"));
        gr3_homePage.address.sendKeys(ConfigReader.getProperty("address"));
        gr3_homePage.postalCode.sendKeys(ConfigReader.getProperty("postalCode"));

        Select select2 = new Select(gr3_homePage.category);
        select2.selectByIndex(2);
        gr3_homePage.password.sendKeys(ConfigReader.getProperty("password"));
        gr3_homePage.registration.click();


        String actualTitle = gr3_homePage.registrationText.getText();
        String expectedTitle = "Thank you to join our team. You are Registered Successfully.";
        Assert.assertEquals(actualTitle,expectedTitle);



    }
}
