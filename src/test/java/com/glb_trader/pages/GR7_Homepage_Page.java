package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GR7_Homepage_Page {

    public GR7_Homepage_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "How Can I list my products?")
    public WebElement listmyproduct1;

    @FindBy(linkText = "How Can I list my products in Glbtrader.com?")
    public WebElement listmyproduct2;

    @FindBy(linkText = "Frequently Asked Questions")
    public WebElement frequentquestions;

    @FindBy(linkText = "Recent questions and answers")
    public WebElement recentQuestions1;

    @FindBy(linkText = "HELP&SUPPORT")
    public WebElement helpsupport;

    @FindBy(xpath = "//img[@class='img-responsive text-center_xs']")
    public WebElement homepage;

    @FindBy(linkText = "About Us")
    public WebElement aboutus;

    @FindBy(id = "grid-page-banner")
    public WebElement aboutUsHome;

    @FindBy(linkText = "Contact Us")
    public WebElement contactUs;

    @FindBy(xpath = "//strong[.='Contact Details']")
    public WebElement contactUsPage;

    @FindBy(partialLinkText = "Services")
    public WebElement services;

    @FindBy(xpath = "//*[@id=\"grid-page-banner\"]/h4")
    public WebElement servicesPage;

    @FindBy(partialLinkText = "Advertise with Us")
    public WebElement adwithus;

    @FindBy(xpath = "//*[h4='Advertise with Us']")
    public WebElement adwithuspage;

    @FindBy(linkText = "Press Section")
    public WebElement pressSection;

    @FindBy(xpath = "//*[h4='Press Section']")
    public WebElement pressSectionPage;

    @FindBy(linkText = "Success Stories")
    public WebElement successStories;

    @FindBy(xpath = "//*[h4='Success Stories']")
    public WebElement successStoriesPage;

    @FindBy(linkText = "Jobs & Careers")
    public WebElement jobsCarrier;

    @FindBy(xpath = "//*[h4='Jobs & Careers']")
    public WebElement jobsCarrierpage;

    @FindBy(linkText = "Feedback")
    public WebElement feedback;

    @FindBy(xpath = "//*[h4='Feedback']")
    public WebElement Feedbackpage;

    @FindBy(linkText = "Buyers and Sellers Guide")
    public WebElement buyersSellersguide;

    @FindBy(xpath = "//*[h4='Buyers and Sellers Guide']")
    public WebElement buyersSellersguidepage;
}
