package com.glb_trader.pages;

import com.glb_trader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gr5_Page {


    public Gr5_Page() {


        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@class='icon_widh']")
    public WebElement manClothing;

    @FindBy(linkText = "T-Shirts")
    public WebElement tshirt;

    @FindBy(xpath = "//*[@id='listing_sort_by']/button[5]")
    public WebElement minPrice;

    @FindBy(xpath = "//*[@id='listing_sort_by']/button[6]")
    public WebElement maxPrice;







}
