package com.twilia.step_definitions;

import com.twilia.pages.LoginPage;
import com.twilia.pages.SalesPage;
import com.twilia.utilities.BrowserUtils;
import com.twilia.utilities.ConfigurationReader;
import com.twilia.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US09StepDefs {

    LoginPage loginPage = new LoginPage();
    SalesPage salesPage = new SalesPage();

    @Given("user is on the TwilliaERP sales manager homepage")
    public void user_is_on_the_twillia_erp_sales_manager_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("sales_manager_username", "sales_manager_password");
        BrowserUtils.waitFor(5);
    }

    @Then("user can see nineteenth different modules")
    public void user_can_see_nineteenth_different_modules(List<String> expectedModuleOptions) {

        Driver.getDriver().manage().window().setSize(new Dimension(1800, 1100));

        List<String> actualModuleOptions = BrowserUtils.getElementsText(By.xpath("//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span"));
        System.out.println("actualModuleOptions = " + actualModuleOptions);
        Assert.assertEquals(expectedModuleOptions, actualModuleOptions);
        int expectedNumberOfModules = expectedModuleOptions.size();
        int actualNumberOfModules = actualModuleOptions.size();
        Assert.assertEquals(expectedNumberOfModules, actualNumberOfModules);
    }

    @Then("user clicks on each modules options and verifies url contains part of the URL")
    public void user_clicks_on_each_modules_options_and_verifies_url_contains_part_of_the_url(List<String> expectedUrl) {

        List<WebElement> actualModuleOptions = Driver.getDriver().findElements(By.xpath("//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span"));

        List<String> listOfUrls = new ArrayList<>();
        System.out.println("expectedUrl = " + expectedUrl);

        for (WebElement eachActualModuleOption : actualModuleOptions) {
           // BrowserUtils.waitFor(5);
            eachActualModuleOption.click();
            BrowserUtils.waitFor(2);
            listOfUrls.add(Driver.getDriver().getCurrentUrl());
            System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
           // BrowserUtils.waitFor(5);

        }
        System.out.println("listOfUrls = " + listOfUrls);
        System.out.println("listOfUrls.size() = " + listOfUrls.size());
        System.out.println("expectedUrl.size() = " + expectedUrl.size());

        for (int i = 0, j = 0; i < expectedUrl.size(); i++, j++) {
            Assert.assertTrue(listOfUrls.get(i).contains(expectedUrl.get(j)));

        }



    }

}
