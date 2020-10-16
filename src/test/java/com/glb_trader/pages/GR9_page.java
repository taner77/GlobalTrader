package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GR9_page {

    public GR9_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "typeahead")
    public WebElement searchBox;
    @FindBy(id = "header_search_category")
    public WebElement dropdown;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;
    @FindBy(partialLinkText = "Apple iPad Pro (256GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display")
    public WebElement appleTablet;


    @FindBy(xpath = "//button[@class='btn btn-default btn-sm  active ']")
    public WebElement newest;
    //@FindBy(xpath = "//div[@class='col-sm-6 col-md-3 col-xs-6 fix_height_both']")
// public WebElement newestlist;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement hot;
    @FindBy(xpath = "(//button[@class='btn btn-default btn-sm '])[3]")
    public WebElement featured;
    @FindBy(xpath = "(//button[@class='btn btn-default btn-sm '])[4]")
    public WebElement minPrice;
    @FindBy(xpath = "(//button[@class='btn btn-default btn-sm '])[5]")
    public WebElement maxPrice;
    @FindBy(xpath = "(//button[@class='btn btn-default btn-sm '])[6]")
    public WebElement freeShping;
    @FindBy(xpath = "//label[@class='list_price_set']")
    public List<WebElement> minPriceList;
    @FindBy(xpath = "//input[@id='typeahead']")
    public WebElement shoppingTextBox;
    @FindBy(xpath = "//label[@class='list_price_set']")
    public List<WebElement> maxPriceList;



}
