package com.twilia.step_definitions;

import com.twilia.pages.InventoryManagerPage;
import com.twilia.pages.LoginPage;
import com.twilia.utilities.BrowserUtils;
import com.twilia.utilities.ConfigurationReader;
import com.twilia.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US02StepDefs {
    LoginPage loginPage = new LoginPage();
    InventoryManagerPage inventoryManagerPage = new InventoryManagerPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitFor(2);

     //   Driver.getDriver().manage().window().setSize(new Dimension(1920,1080));
       // BrowserUtils.waitFor(2);

    }

    @Then("user enters correct username, password and login")
    public void user_enters_correct_username_password_and_login() {
        loginPage.login("inventory_manager_username", "inventory_manager_password");
    }

    @Then("user land on inbox, should see text {string}")
    public void userLandOnInboxShouldSeeText(String expectedText) {
        String actualText = inventoryManagerPage.inboxText.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Then("user able to click all the module")
    public void user_able_to_click_all_the_module(List<String> expectedModule) {
        List<String> actualModule = inventoryManagerPage.listOfModulesAsString();
        System.out.println(actualModule);
        for (WebElement each : inventoryManagerPage.listOfModulesAsElement()) {
            BrowserUtils.waitFor(2);
            if(each.getText().equals("Website") || each.getText().equals("Lunch")){
                continue;
            }else{
                each.click();

            }
        }

       Assert.assertTrue(actualModule.containsAll(expectedModule));

        }


    }













