package com.twilia.step_definitions;

import com.twilia.pages.LoginPage;
import com.twilia.utilities.BrowserUtils;
import com.twilia.utilities.ConfigurationReader;
import com.twilia.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class US07_Stepdefs {

    LoginPage loginPage = new LoginPage();



    @Given("the event manager logs into the system")
    public void theEventManagerLogsIntoTheSystem() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("events_crm_manager_username","events_crm_manager_password");

    }


    @Then("the event manager should see {int} modules")
    public void theEventManagerShouldSeeModules(int expectedModuleCount) {
        List<WebElement> moduleList = new ArrayList<>();
        for (int i = 1; i < 16; i++) {
            WebElement listOfModule = Driver.getDriver().findElement(By.xpath("(//a)[" + i +"]"));
            moduleList.add(listOfModule);

            System.out.print(moduleList.size());


        }

        Assert.assertEquals(moduleList.size(), expectedModuleCount);

    }


}


