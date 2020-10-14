package com.glb_trader.tests;

import com.glb_trader.pages.GR7_Homepage_Page;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GR7_Homepage_Test extends TestBase {

    GR7_Homepage_Page gr7_homepage_page = new GR7_Homepage_Page();

    @Test
    public void gotoHomePage(){
        setupMethod();
        Assert.assertTrue(driver.getTitle().contains("Online Shopping Site for Mobiles, Fashion, Books"));
    }

    @Test
    public void listMyProduct(){
        gr7_homepage_page.listmyproduct1.click();
        Assert.assertTrue(gr7_homepage_page.listmyproduct2.getText().equals("How Can I list my products in Glbtrader.com?"));
    }
    @Test
    public void recentquestions(){
        gr7_homepage_page.frequentquestions.click();
    Assert.assertTrue(gr7_homepage_page.recentQuestions1.getText().equals("Recent questions and answers"));
}
    @Test
    public void helpSupport(){
        gr7_homepage_page.helpsupport.click();
        Assert.assertTrue(gr7_homepage_page.recentQuestions1.getText().equals("Recent questions and answers"));}

        @Test
        public void homePage(){
        gr7_homepage_page.home.click();
        Assert.assertTrue(gr7_homepage_page.homepage.getText().equals("Home"));
        }
    @Test
    public void aboutUs(){
        gr7_homepage_page.aboutus.click();
        //String text=gr7_homepage_page.aboutUsHome.getText();
        //System.out.println(text);
        Assert.assertTrue(gr7_homepage_page.aboutUsHome.getText().equals("About Us"));
        }
@Test
    public void contactUs(){

        gr7_homepage_page.contactUs.click();
        Assert.assertTrue(gr7_homepage_page.contactUsPage.getText().equals("Contact Details"));
}
@Test
    public void services(){

        gr7_homepage_page.services.click();
        Assert.assertTrue(gr7_homepage_page.servicesPage.getText().equals("Services"));

}
@Test
    public void advertise(){

        gr7_homepage_page.adwithus.click();
        Assert.assertTrue(gr7_homepage_page.adwithuspage.getText().equals("Advertise with Us"));
}

@Test
public void pressSectin(){
        gr7_homepage_page.pressSection.click();
        Assert.assertTrue(gr7_homepage_page.pressSectionPage.getText().equals("Press Section"));
}


@Test
public void succesStories(){
        gr7_homepage_page.successStories.click();
        Assert.assertTrue(gr7_homepage_page.successStoriesPage.getText().equals("Success Stories"));
}


@Test
    public void jobsAndCarriers(){
        gr7_homepage_page.jobsCarrier.click();
        Assert.assertTrue(gr7_homepage_page.jobsCarrierpage.getText().equals("Jobs & Careers"));

}
@Test
    public void feedback(){
        gr7_homepage_page.feedback.click();
        Assert.assertTrue(gr7_homepage_page.Feedbackpage.getText().equals("Feedback"));
}

@Test
    public void buyersSellersguide(){

        gr7_homepage_page.buyersSellersguide.click();
        gr7_homepage_page.buyersSellersguidepage.getText().equals("Buyers and Sellers Guide");
}
}
