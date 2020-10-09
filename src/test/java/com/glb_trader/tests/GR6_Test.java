package com.glb_trader.tests;

import com.glb_trader.pages.GR6_Page;
import com.glb_trader.utilities.ConfigurationReader;
import com.glb_trader.utilities.Driver;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.swing.*;
import java.util.List;

public class GR6_Test extends TestBase {
    GR6_Page gr6_page = new GR6_Page();

    @Test
    public void appleTest() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("envorinment"));
        gr6_page.sigiIn.click();
        gr6_page.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
        gr6_page.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        gr6_page.loginButton.click();
        gr6_page.homePageButton.click();
        gr6_page.allCategoryDropDown.click();
        Select select = new Select(gr6_page.allCategoryDropDown);
        select.selectByIndex(4);
        gr6_page.searchButton.submit();
        gr6_page.appleTablet.click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        gr6_page.addToCarddButton.click();
        //String text = gr6_page.uniqueId.getText();
        // Assert.assertTrue(text.contains("1131"));is this bug?
        driver.navigate().back();
        gr6_page.contacSeller.click();
        gr6_page.messageArea.sendKeys(ConfigurationReader.getProperty("productMessage"));
        gr6_page.sendButton.click();
        String message = gr6_page.succesfullyMessage.getText();
        Assert.assertTrue(message.contains(ConfigurationReader.getProperty("succesfullyMessage")));
        driver.navigate().back();
        driver.navigate().back();
        gr6_page.addWishListButton.click();
        gr6_page.alertMesage.click();// is this bug?
        action.sendKeys(Keys.PAGE_UP).perform();
        gr6_page.myWishList.click();
        WebElement statusTable = driver.findElement(By.id("dataTables-example"));
        List<WebElement> allRows = statusTable.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            if(row.getText().contains("Apple iPad Pro (256GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display")){
                System.out.println("urun basariyla MY WISH LIST'e eklenmistir");
            }
        }
    }
}
