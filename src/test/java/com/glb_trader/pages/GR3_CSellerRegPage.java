package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GR3_CSellerRegPage {

    public GR3_CSellerRegPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement  Seller_Join_Now;

    @FindBy(id = "company_name")
    public WebElement company_name;

    @FindBy(id = "company_mobile")
    public WebElement company_mobile;

    @FindBy(id = "company_address")
    public WebElement company_address;

    @FindBy(id = "vender_name")
    public WebElement sellerName;

    @FindBy(id = "email")
    public WebElement sellerEmail;

    @FindBy(id = "sub_domain")
    public WebElement sellerWebSiteAddress;

    @FindBy(id = "vender_mobile")
    public WebElement sellerMobilPhone;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement country;

    @FindBy(id = "select_state")
    public WebElement state;

    @FindBy(id = "select_city")
    public WebElement city;

    @FindBy(id = "vender_address")
    public WebElement address;

    @FindBy(id = "zip_code_input")
    public WebElement postalCode;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement category;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath= "//button[@value='Login']")
    public WebElement registration;

    @FindBy(xpath= "(//p[@class='text-center'])[2]")
    public WebElement registrationText;




}
