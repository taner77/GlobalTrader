package com.glb_trader.pages;
import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BuyPage {
    public BuyPage() {
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





}