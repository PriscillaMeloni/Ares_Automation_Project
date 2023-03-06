package com.twilia.pages;

import com.twilia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PointOfSalePage extends BasePage {
    public PointOfSalePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="login")
    public WebElement emailBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath= "//button[@type='submit']")
    public WebElement Login;

    @FindBy(xpath="(//a)[1]")
    public WebElement moduleList;

public List<WebElement> eachModule(){
    List<WebElement> list2=new ArrayList<>();
   // List<String> list3=new ArrayList<>();
    for (int i = 1; i <23 ; i++) {
WebElement moduleList=Driver.getDriver().findElement(By.xpath("(//a)["+i+"]"));
list2.add(moduleList);

    }

    return list2;

}

}
