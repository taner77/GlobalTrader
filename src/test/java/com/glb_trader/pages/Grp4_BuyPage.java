package com.glb_trader.pages;
import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grp4_BuyPage {
    public Grp4_BuyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "header_search_category")
    public WebElement allCategories;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
    @FindBy(partialLinkText = "Apple iPad Pro")
    public WebElement iPadPro;
    @FindBy(id = "email")
    public WebElement mailBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(name = "submit")
    public WebElement submitButton;
    @FindBy(linkText = "Sign In")
    public WebElement singInButton;
    @FindBy(linkText = "16GB")
    public WebElement GB16;
    @FindBy(xpath = "//span[@class='bold black font16']")
    public WebElement starsOfProduct;
    @FindBy(xpath = "//span[@class='text-muted font13']")
    public WebElement qtyViews;
    @FindBy(xpath = "(//span[@class='bold black font16'])[2]")
    public WebElement qtyOrders;
    @FindBy(xpath = "(//span[@class='yellow'])[2]")
    public WebElement inStock;
    @FindBy(xpath = "//h4")
    public WebElement productInfo;
    @FindBy(linkText = "32GB")
    public WebElement GB32;
    @FindBy(linkText = "64GB")
    public WebElement GB64;
    @FindBy(linkText = "128GB")
    public WebElement GB128;
    @FindBy(linkText = "256GB")
    public WebElement GB256;
    @FindBy(xpath = "//a[@class='plus']")
    public  WebElement qtyPlus;
    @FindBy(xpath = "//a[@class='minus']")
    public WebElement qtyMinus;
    @FindBy(partialLinkText = "Apple IPad Pro Tablet")
    public WebElement productComment;
    @FindBy(xpath = "//body")
    public WebElement errorMessage;
    @FindBy(css = "a[href='#feedback_form']")
    public WebElement feedbackButton;
    @FindBy(id = "usr")
    public WebElement yourName;
    @FindBy(id = "sel1")
    public WebElement starRate;
    @FindBy(id = "comment")
    public WebElement commentBox;
    @FindBy(id = "review_submit")
    public WebElement leaveReview;
    @FindBy(css = "span[id='alert_messages_show']")
    public WebElement feedbackMessage;
    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement alertMessageClose;
    @FindBy(css ="a[role='tab']")
    public WebElement shippingButton;
    @FindBy(linkText = "Shipping & Payments")
    public WebElement shippingPayments;

}