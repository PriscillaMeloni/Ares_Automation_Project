package com.twilia.pages;

import com.twilia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagerPage {

    public InventoryManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='o_thread_title']")
    public WebElement inboxText;

    public List<String> listOfModulesAsString(){

        List<WebElement> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        for (int i = 1; i < 17; i++) {
            WebElement listOfModule = Driver.getDriver().findElement(By.xpath("(//a)[" + i +"]"));
            list2.add(listOfModule);
        }
        for (WebElement eachElement : list2) {
            list3.add(eachElement.getText());
        }
        return list3;
    }

    public List<WebElement> listOfModulesAsElement(){
        int a = 1;
        List<WebElement> list2 = new ArrayList<>();
        for (int i = 1; i < 17; i++) {
            WebElement listOfModule = Driver.getDriver().findElement(By.xpath("(//a)[" + i +"]"));
            list2.add(listOfModule);

             
        }
        return list2;
    }




}
