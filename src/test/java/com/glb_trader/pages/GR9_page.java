package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


}


