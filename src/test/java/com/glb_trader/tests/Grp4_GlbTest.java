package com.glb_trader.tests;
import com.glb_trader.pages.BuyPage;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class GlbTest {
    BuyPage buyPage = new BuyPage();
    SoftAssert softAssert = new SoftAssert();
    @BeforeMethod
    public void singIn(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_url"));
        buyPage.singInButton.click();
        buyPage.mailBox.sendKeys(ConfigurationReader.getProperty("user_name"));
        buyPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        buyPage.submitButton.click();
    }
    @Test
    public void productInfo(){
        buyPage.allCategories.click();
        Select select = new Select(buyPage.allCategories);
        select.selectByVisibleText("Computer & Office");
        buyPage.searchButton.click();
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
        //       softAssert.assertAll();
    }
}