package com.glb_trader.tests;

import com.glb_trader.pages.GR1_Page;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GR1_Test extends TestBase {

    @Test
    public void UserStory01() {
        //SoftAssert softAssert = new SoftAssert();
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
        //softAssert.assertTrue(us022_page.memberIcon.getText().equals("wiseteam01"));

        us022_page.editButtonProfile.click();
        us022_page.name.clear();
        us022_page.updateButton.click();
        Assert.assertTrue(us022_page.nameAlert.getText().contains("Please Enter the Name."));
        //softAssert.assertTrue(us022_page.nameAlert.getText().equals("Please Enter the Name."));

        us022_page.changePassword.click();
        us022_page.old_pass.sendKeys("1");
        us022_page.new_pass.sendKeys("1");
        us022_page.con_pass.sendKeys("1");
        us022_page.submit.click();
        Assert.assertTrue(us022_page.succesMessage.getText().contains("Password changed successfully"));
        //softAssert.assertTrue(us022_page.succesMessage.getText().equals("Password changed successfully"));
        //softAssert.assertAll();

        us022_page.old_pass.clear();
        us022_page.new_pass.sendKeys("1");
        us022_page.con_pass.sendKeys("1");
        us022_page.submit.click();
        Assert.assertTrue(us022_page.old_pass_message.getText().equals("Please Enter Old Password."));
        //softAssert.assertTrue(us022_page.old_pass_message.getText().equals("Please Enter Old Password."));
        //softAssert.assertAll();
        us022_page.old_pass.sendKeys("5");
        us022_page.new_pass.sendKeys("1");
        us022_page.con_pass.sendKeys("1");
        us022_page.submit.click();
        Assert.assertTrue(us022_page.old_pass_wrong_message.getText().equals("Wrong Password"));

        us022_page.old_pass.clear();
        us022_page.old_pass.sendKeys("1");
        us022_page.new_pass.clear();
        us022_page.con_pass.clear();
        us022_page.submit.click();
        Assert.assertTrue(us022_page.alert_re_password.getText().equals("Please enter Confirm Password."));

        us022_page.old_pass.clear();
        us022_page.old_pass.sendKeys("1");
        us022_page.new_pass.clear();
        us022_page.con_pass.sendKeys("1");
        us022_page.submit.click();
        Assert.assertTrue(us022_page.alert_new_password.getText().equals("Please Enter New Password."));

        us022_page.old_pass.clear();
        us022_page.new_pass.clear();
        us022_page.con_pass.clear();
        us022_page.submit.click();
        Assert.assertTrue(us022_page.old_pass_message.getText().equals("Please Enter Old Password."));
        Assert.assertTrue(us022_page.alert_re_password.getText().equals("Please enter Confirm Password."));
        Assert.assertTrue(us022_page.alert_new_password.getText().equals("Please Enter New Password."));

        us022_page.old_pass.sendKeys("1");
        us022_page.new_pass.sendKeys("1");
        us022_page.con_pass.sendKeys("1");
        us022_page.submit.click();
        Assert.assertTrue(us022_page.succesMessage.getText().contains("Password changed successfully"));

        us022_page.wishlist.click();
        Assert.assertTrue(us022_page.wishListBox.isDisplayed());
        us022_page.nextButton.click();
        us022_page.prevButton.click();
        us022_page.removeButton.click();



    }
}
