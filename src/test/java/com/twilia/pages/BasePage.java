package com.twilia.pages;

import com.twilia.utilities.BrowserUtils;
import com.twilia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {


    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']")
    public List<WebElement> menuOptions;


   //insert all modules locators here
    @FindBy(xpath = "//span[normalize-space()='Discuss']")
    public WebElement discussModule;

    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement calendarModule;

    @FindBy(xpath = "//span[normalize-space()='Notes']")
    public WebElement notesModule;

    @FindBy(xpath = "//span[normalize-space()='Contacts']")
    public WebElement contactModule;

    @FindBy(xpath = "//span[normalize-space()='CRM']")
    public WebElement crmModule;

    @FindBy(xpath = "//span[normalize-space()='Sales']")
    public WebElement salesModule;

    @FindBy(xpath = "//span[normalize-space()='Website']")
    public WebElement websiteModule;

    @FindBy(xpath = "//span[normalize-space()='Point of Sale']")
    public WebElement pointOfSaleModule;

    @FindBy(xpath = "//span[normalize-space()='Purchases']")
    public WebElement purchasesModule;
    @FindBy(xpath = "//span[normalize-space()='Inventory']")
    public WebElement inventoryModule;
    @FindBy(xpath = "//span[normalize-space()='Manufacturing']")
    public WebElement manufacturingModule;

    @FindBy(xpath = "//span[normalize-space()='Repais']")
    public WebElement repairsModule;

    @FindBy(xpath = "//span[normalize-space()='Project']")
    public WebElement ProjectModule;
    @FindBy(xpath = "//span[normalize-space()='Events']") //a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][normalize-space()='Events']
    public WebElement eventsModule;
    @FindBy(xpath = "//span[normalize-space()='Surveys']")
    public WebElement surveysModule;



    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /**
     * @return page name, for example: Dashboard
     */
    /*
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

     */



    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
          //  wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }

}
