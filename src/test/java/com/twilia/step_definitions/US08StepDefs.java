package com.twilia.step_definitions;

import com.twilia.pages.LoginPage;
import com.twilia.utilities.BrowserUtils;
import com.twilia.utilities.ConfigurationReader;
import com.twilia.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US08StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User logged in as ExpensesManager")
    public void userLoggedInAsExpensesManager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("expenses_manager_username", "expenses_manager_password");
        BrowserUtils.waitFor(5);
        Driver.getDriver().manage().window().maximize();

    }

    @Then("User can see twelve different modules")
    public void userCanSeeDifferentModules(List<String> expectedModules) {
        List<WebElement> actualModules = Driver.getDriver().findElements(By.xpath("//ul [@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span"));
        int expectedSize = expectedModules.size();
        int actualSize = actualModules.size();
        Assert.assertEquals(actualSize, expectedSize);
        System.out.println("actualSize = " + actualSize);
        System.out.println("expectedSize = " + expectedSize);


        List<String> actualModulesText = new ArrayList<String>();
        for (WebElement eachActualModules : actualModules) {
            String actualModuleText = eachActualModules.getText();
            actualModulesText.add(actualModuleText);

        }
        System.out.println("expectedModules = " + expectedModules);
        System.out.println("actualModulesText = " + actualModulesText);
        Assert.assertEquals(actualModulesText, expectedModules);
    }

    @Then("User click on each modules and can access to the following page titles")
    public void userClickOnEachModulesAndCanAccessToTheFollowingPageTitles(List<String> expectedTitle) {
        List<WebElement> actualModules = Driver.getDriver().findElements(By.xpath("//ul [@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span"));

        List<String>actualTitle= new ArrayList<>();
        for (int i=0;i< actualModules.size();i++){
            actualModules = Driver.getDriver().findElements(By.xpath("//ul [@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span"));
            BrowserUtils.sleep(2);
            actualModules.get(i).click();
            BrowserUtils.sleep(2);
            actualTitle.add(Driver.getDriver().getTitle());
            BrowserUtils.sleep(2);
            if (Driver.getDriver().getCurrentUrl().equals("https://qa.twiliaerp.com/")) {
                WebElement website = Driver.getDriver().findElement(By.xpath("//a [@class='dropdown full']"));
                if (website.isDisplayed()) {
                    Driver.getDriver().navigate().back();
                    BrowserUtils.sleep(2);
                }
            }
            if (Driver.getDriver().getTitle().equals("New Order - Odoo")){
                Driver.getDriver().findElement(By.xpath("//button [@class='btn btn-sm btn-primary']//span")).click();
            }


        }
        System.out.println("expectedTitle = " + expectedTitle);

        System.out.println("actualTitle = " + actualTitle);


        for (int i=0, j=0; i<expectedTitle.size(); i++, j++){



            Assert.assertTrue(actualTitle.get(i).contains(expectedTitle.get(j)));



        }


    }
}

/*
  WebElement alert= Driver.getDriver().findElement(By.xpath("//button [@class='btn btn-sm btn-primary']//span"));
            if (alert.isEnabled()){
                alert.click();
            }
            WebElement website = Driver.getDriver().findElement(By.xpath("//a [@class='dropdown full']"));
            if (website.isEnabled()){

            }
 */


        





