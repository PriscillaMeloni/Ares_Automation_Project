package com.twilia.step_definitions;

import com.twilia.pages.LoginPage;
import com.twilia.pages.PointOfSalePage;
import com.twilia.utilities.BrowserUtils;
import com.twilia.utilities.ConfigurationReader;
import com.twilia.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US03StepDefs {
    PointOfSalePage pointOfSalePage=new PointOfSalePage();
    LoginPage loginPage=new LoginPage();
    @Given("POS manager is on the login page page.")
    public void pos_manager_is_on_the_login_page_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @When("POS enters username and password and login.")
    public void pos_enters_username_and_password_and_login() {
        loginPage.login("pos_manager_username","pos_manager_password");
    }





    @Then("POS manager clicks on each module.")
    public void pos_manager_clicks_on_each_module(List<String> expectedTitle) {
        Driver.getDriver().manage().window().setSize(new Dimension(1800, 1100));
            List<String> titleText=new ArrayList<>();
            for (WebElement element : pointOfSalePage.eachModule()) {
                BrowserUtils.sleep(3);
                element.click();
                BrowserUtils.sleep(3);
                titleText.add(Driver.getDriver().getTitle());
                BrowserUtils.sleep(2);

            }
            System.out.println("titleText = " + titleText);
            System.out.println("expectedTitle = " + expectedTitle);
           // System.out.println(titleText.size());
           // System.out.println(expectedTitle.size());
        for (int i = 0,j=0; i < expectedTitle.size() ; i++,j++) {
            Assert.assertTrue(titleText.get(i).contains(expectedTitle.get(j)));
        }
        }


        }




