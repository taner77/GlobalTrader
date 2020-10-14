package com.glb_trader.tests;

import com.glb_trader.pages.Grp4_BuyPage;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.List;


public class Grp4_FeedbackAndShipping {
    Grp4_BuyPage buyPage = new Grp4_BuyPage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void feedback(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_url"));
        buyPage.allCategories.click();
        ReusableMethods.selectByVisibleText(buyPage.allCategories, "Computer & Office");
        buyPage.searchButton.click();
        buyPage.iPadPro.click();
        buyPage.feedbackButton.click();
        buyPage.yourName.sendKeys(ConfigurationReader.getProperty("your_name"));
        WebElement element = buyPage.starRate;
        ReusableMethods.selectByIndex(element, 3);
        buyPage.commentBox.sendKeys("It's really hard to buy products from this website");
        buyPage.leaveReview.click();

        ReusableMethods.waitForVisibility(buyPage.feedbackMessage,10);
        String feedbackMessage = buyPage.feedbackMessage.getText();
        softAssert.assertEquals(feedbackMessage, "Please First Login Then Use this Function");
        softAssert.assertAll();
        buyPage.alertMessageClose.click();
        buyPage.shippingButton.click();
    }

    @Test
    public void shippingPayment(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_url"));
        buyPage.allCategories.click();
        ReusableMethods.selectByVisibleText(buyPage.allCategories, "Computer & Office");
        buyPage.searchButton.click();
        buyPage.iPadPro.click();
        buyPage.shippingPayments.click();

        List<WebElement> headers = Driver.getDriver().findElements(By.xpath("//table/thead/tr"));
        for (WebElement header:headers) {
            System.out.println("Table headers : " + header.getText());
        }

        List<WebElement> companies = Driver.getDriver().findElements(By.xpath("//table/tbody[2]/tr/td[1]"));
        System.out.println("company count: " + companies.size());

        for (WebElement company:companies) {
            System.out.println(company.getText());
        }

        List<WebElement> dhlCargo = Driver.getDriver().findElements(By.xpath("//table/tbody[2]/tr[1]/td"));
        for (WebElement data:dhlCargo) {
            System.out.print(data.getText() + " ");
        }
    }
}