package com.glb_trader.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GR1_US022_Page {

    WebDriver driver;
    public GR1_US022_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    public WebElement mail_address;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@onclick='return Valid_login(document.login);']")
    public WebElement loginButton;
    @FindBy(partialLinkText = "Welcome wiseteam01")
    public WebElement memberIcon;
    @FindBy(xpath ="//*[@id=\"main_category\"]/ul/li[3]/a")
    public WebElement myOrder;
    @FindBy(xpath ="//*[@id=\"main_category\"]/ul/li[5]/a")
    public WebElement tranHistory;
    @FindBy(xpath = "(//td[@class='set-font-size'])[4]")
    public WebElement transHistoryMessage;
    @FindBy(xpath ="//*[@id=\"main_category\"]/ul/li[6]/a")
    public WebElement enquiry;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement enquiryMesage;
    @FindBy(xpath = "//*[@id=\"main_category\"]/ul/li[1]/a")
    public WebElement personalProfile;
    @FindBy(xpath = "//*[@id=\"category-grid\"]/div/div[3]/div/div[2]/div/div/a")
    public WebElement editButton;
    @FindBy(name = "name")
    public WebElement name;
    @FindBy(name = "country")
    public WebElement country;
    @FindBy(name = "state_drop")
    public WebElement state;
    @FindBy(name = "city_drop")
    public WebElement city;
    @FindBy(name = "landline")
    public WebElement landline;
    @FindBy(name = "mobile")
    public WebElement mobile;
    @FindBy(name = "address")
    public WebElement address;
    @FindBy(xpath = "//button[@value='Update']")
    public WebElement updateButton;
    @FindBy(xpath = "//a[@class='le-button btn']")
    public WebElement editButtonProfile;
    @FindBy(id = "alert_name")
    public WebElement nameAlert;
    @FindBy(xpath = "//*[@id=\"main_category\"]/ul/li[2]/a")
    public WebElement changePassword;
    @FindBy(name = "old_pass")
    public WebElement old_pass;
    @FindBy(name = "new_pass")
    public WebElement new_pass;
    @FindBy(name = "con_pass")
    public WebElement con_pass;
    @FindBy(name = "submit")
    public WebElement submit;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement succesMessage;










}
