package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GR7_Homepage_Page {

    public GR7_Homepage_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "How Can I list my products?")
    public WebElement listmyproduct1;

    @FindBy(linkText = "How Can I list my products in Glbtrader.com?")
    public WebElement listmyproduct2;

}
