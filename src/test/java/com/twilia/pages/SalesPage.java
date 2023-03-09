package com.twilia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage extends BasePage{

@FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement posManagerHomePage;

@FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement salesManagerHomePage;







//locate Quotation box
    @FindBy(xpath = "//th[@class='o_list_record_selector']")
    public WebElement quotationMainBox;

    //locate all the checkboxes options 83
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement allQuotationBoxes;


}
