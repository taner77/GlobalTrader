package com.glb_trader.tests;
import com.glb_trader.pages.GR9_page;
import com.glb_trader.utilities.ReusableMethods;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GR9_Test extends TestBase {

    GR9_page gr9_page = new GR9_page();
    @Test
    public void categories() throws InterruptedException {
        gr9_page.searchBox.sendKeys("ipad");
        gr9_page.searchButton.click();
        Select select = new Select(gr9_page.dropdown);
        select.selectByValue("41");
        ReusableMethods.waitForVisibility(gr9_page.appleTablet,10);
        Assert.assertTrue(gr9_page.appleTablet.isDisplayed());

    }
}
