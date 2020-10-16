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
    public WebElement maxPrice1;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[4]/div[1]/div/div[3]/div[2]/div[1]/div/label/text()")
    public WebElement sortByMin;

    @FindBy(xpath = "//i[@class='fa fa-arrow-up']")
    public WebElement maxPrice;

    @FindBy(xpath = "//h4[@class='bold'][3]")
    public WebElement size;

    @FindBy(xpath = "//h4[@class='bold'][2]")
    public WebElement brand;

    @FindBy(xpath = "//h4[@class='bold'][4]")
    public WebElement applicablePeople;

    @FindBy(xpath = "//*[.='Unisex']")
    public WebElement applicableSort1;

    @FindBy(xpath = "//*[.='Male']")
    public WebElement applicableSort2;






}
