package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.nio.cs.SingleByte;

public class GR6_Page {
    public GR6_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(partialLinkText = "Sign In")
    public WebElement sigiIn;

    @FindBy(xpath = "//img[@class='img-responsive text-center_xs']")
    public WebElement homePageButton;

    @FindBy(name = "buynow_submit")
    public WebElement buyNowButton;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(name = "submit")
    public WebElement loginButton;

    @FindBy(id = "header_search_category")
    public WebElement allCategoryDropDown;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;

    @FindBy(partialLinkText = "Apple iPad Pro (256GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display")
    public WebElement appleTablet;

    @FindBy(name = "buynow_submit")
    public WebElement addToCarddButton;

    @FindBy(xpath ="//span[text()='Unique Id']")
    public WebElement uniqueId;

    @FindBy(xpath = "//a[@class='btn btn_two form-control padd_btn']")
    public WebElement contacSeller;

    @FindBy(id="message")
    public WebElement messageArea;

    @FindBy(id = "contact_submit")
    public WebElement sendButton;

    @FindBy(xpath = "//div[text()='Your Data Send Successfully!!']")
    public WebElement succesfullyMessage;

    @FindBy(xpath = "//a[@class='default_link_cursor padd_btn poll-right']")
    public WebElement addWishListButton;

    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement alertMesage;

    @FindBy(xpath = "//a[@class='red']")
    public WebElement myWishList;




}
