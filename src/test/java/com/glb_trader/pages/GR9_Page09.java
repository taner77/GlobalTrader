package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GR9_Page09 {

    public GR9_Page09(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "typeahead")
    public WebElement searchBox;
    @FindBy(id = "header_search_category")
    public WebElement dropdown;
    @FindBy(xpath = "//a[.=' Maniac Solid Mens Round Neck T-Shirtsdafas ']")
    public WebElement shirtText;
    @FindBy(xpath = "(//a[@title='Canon EOS Rebel SL1 DSLR Camera with EF-S 18-55mm f/3.5-5.6 IS STM Lens Kit'])[2]")
    public WebElement cameraText;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;
}
