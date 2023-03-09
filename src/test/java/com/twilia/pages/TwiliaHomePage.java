package com.twilia.pages;

import com.twilia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class TwiliaHomePage extends BasePage {

    public TwiliaHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="login")
    public WebElement inputEmail;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']//span")
    public WebElement pointOfSale;

    @FindBy(css = "a[href=\"/web#menu_id=489&action=663\"]>span")
    public WebElement orderButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement orderRefButton;

    @FindBy(xpath = "(//button[@aria-expanded='false'])[2]")
    public WebElement actionButton;

    @FindBy(xpath = "//a[@data-index='1']")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[@data-index='0']")
    public WebElement exportButton;






    }







