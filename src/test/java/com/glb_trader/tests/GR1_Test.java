package com.glb_trader.tests;

import com.glb_trader.pages.GR1_Page;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GR1_Test extends TestBase {

    @Test
    public void UserStory01() {

        GR1_Page us022_page = new GR1_Page(driver);
        driver.get("https://www.glbtrader.com/login.html");
        us022_page.mail_address.sendKeys("qatesteradayi@gmail.com");
        us022_page.password.sendKeys("1");
        us022_page.loginButton.click();
        us022_page.memberIcon.click();
        us022_page.myOrder.click();
        us022_page.tranHistory.click();
        Assert.assertTrue(us022_page.transHistoryMessage.isDisplayed());
        us022_page.enquiry.click();
        Assert.assertTrue(us022_page.enquiryMesage.isDisplayed());
        us022_page.personalProfile.click();
        us022_page.editButton.click();
        us022_page.name.clear();
        us022_page.name.sendKeys("wiseteam01");
        Select country = new Select(us022_page.country);
        country.selectByVisibleText("USA");// burada America yaziyor bug var
        Select state = new Select(us022_page.state);
        state.selectByVisibleText("NY");// burada NewYork yaziyor bug var
        Select city =new Select(us022_page.city);
        city.selectByVisibleText("New York"); // burada NewYork City yok Bug var
        us022_page.landline.sendKeys("2");
        us022_page.mobile.sendKeys("987654321");
        us022_page.address.clear();
        us022_page.address.sendKeys("Times Square");
        us022_page.updateButton.click();
        Assert.assertTrue(us022_page.memberIcon.getText().contains("wiseteam01"));
        us022_page.editButtonProfile.click();
        us022_page.name.clear();
        us022_page.updateButton.click();
        Assert.assertTrue(us022_page.nameAlert.getText().contains("Please Enter the Name."));
        us022_page.changePassword.click();
        us022_page.old_pass.sendKeys("1");
        us022_page.new_pass.sendKeys("1");
        us022_page.con_pass.sendKeys("1");
        us022_page.submit.click();
        Assert.assertTrue(us022_page.succesMessage.getText().contains("Password changed successfully"));





    }
}
