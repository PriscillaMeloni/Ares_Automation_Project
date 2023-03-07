package com.twilia.pages;


import com.twilia.utilities.ConfigurationReader;
import com.twilia.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // It is updated already!!!
    @FindBy(xpath = "//input[@id='login']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;




    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(ConfigurationReader.getProperty(userNameStr));
        password.sendKeys(ConfigurationReader.getProperty(passwordStr));
        submit.click();

        // verification that we logged
    }

    public List<WebElement> ListOfModules(){

        List<WebElement> list2 = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            WebElement listOfModule = Driver.getDriver().findElement(By.xpath("(//a)[" + i +"]"));
        list2.add(listOfModule);
        }
        return list2;
    }

}
