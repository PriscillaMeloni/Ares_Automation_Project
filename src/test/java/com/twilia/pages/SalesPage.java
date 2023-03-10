package com.twilia.pages;

import com.twilia.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage extends BasePage{

    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }







//locate Quotation box
    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement quotationMainBox;

    //locate all the checkboxes options 83

    //table/tbody/tr/td[@class='o_list_record_selector']
    @FindBy(xpath = "//table/tbody/tr/td[1]/div[@class='o_checkbox']/input")
    public WebElement allQuotationBoxes;

    public void assertCheckBoxesSelected(){
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table/tbody/tr/td[1]/div[@class='o_checkbox']/input"));

        int count=0;
        for (int i = 0; i < checkboxes.size(); i++) {
            Assert.assertEquals(true, checkboxes.get(i).isSelected());
            count++;
        }
        System.out.println(count);

    }

}
