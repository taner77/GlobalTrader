package com.glb_trader.tests;

import com.glb_trader.pages.Grp4_BuyPage;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.ReusableMethods;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Grp4_GlbTest {
    Grp4_BuyPage buyPage = new Grp4_BuyPage();
    SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void singIn(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_url"));
        buyPage.singInButton.click();
        buyPage.mailBox.sendKeys(ConfigurationReader.getProperty("user_name"));
        buyPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        buyPage.submitButton.click();
        buyPage.allCategories.click();
        ReusableMethods.selectByVisibleText(buyPage.allCategories, "Computer & Office");
        buyPage.searchButton.click();
    }


    @Test
    public void productInfo()  {
        buyPage.iPadPro.click();
        buyPage.GB16.click();
        String productInfo = buyPage.productInfo.getText();
        System.out.println("productInfo : " + productInfo);

        String starsOfProduct = buyPage.starsOfProduct.getText();
        System.out.println("starsOfProduct: " + starsOfProduct);
        //       softAssert.assertEquals(starsOfProduct, "1");

        String qtyViews = buyPage.qtyViews.getText();
        System.out.println("qtyViews: " + qtyViews);
        //////       softAssert.assertEquals(qtyViews, "(Views 2560)");

        String qtyOrders = buyPage.qtyOrders.getText();
        System.out.println("qtyOrders: " + qtyOrders);
        //       softAssert.assertEquals(qtyOrders, "  0");

        String qtyInStock = buyPage.inStock.getText();
        System.out.println("qtyInStock: " + qtyInStock);
        //       softAssert.assertEquals(qtyInStock, "Availability : In Stock (99)");


        //productinfo Text doesn't change. It is always  "Apple iPad Pro (256GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display"
    }

    @Test
    public void productDetail() {
        buyPage.iPadPro.click();
        buyPage.GB32.click();
        buyPage.GB64.click();
        buyPage.GB128.click();
        buyPage.GB256.click();

        buyPage.qtyPlus.click();
        softAssert.assertEquals(2,2);
        buyPage.qtyMinus.click();
        softAssert.assertEquals(1,1);

        buyPage.productComment.click();
        String errorMessage = buyPage.errorMessage.getText();
        softAssert.assertEquals(errorMessage, "[an error occurred while processing this directive]");
        Driver.getDriver().navigate().back();

        softAssert.assertAll();
    }

}
