package com.twilia.pages;

import com.twilia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairsPage extends BasePage{

    public RepairsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[class*='o_column_sortable']")
    public List<WebElement> columnOptions;

   /* @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement repairsModule;*/


}
