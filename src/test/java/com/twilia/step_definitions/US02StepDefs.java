package com.twilia.step_definitions;

import com.twilia.pages.BasePage;
import com.twilia.pages.LoginPage;
import com.twilia.pages.RepairsPage;
import com.twilia.utilities.BrowserUtils;
import com.twilia.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US02StepDefs {
    LoginPage loginPage = new LoginPage();
    RepairsPage repairsPage = new RepairsPage();


    @When("the user navigates to Repairs module and clicks")
    public void the_user_navigates_to_repairs_module_and_clicks() {
        BrowserUtils.sleep(5);
        repairsPage.repairsModule.click();


    }
    @Then("the user should be able to see 6 following column options")
    public void the_user_should_be_able_to_see_6_following_column_options(List<String> columnOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(repairsPage.columnOptions);

        Assert.assertEquals(columnOptions, actualOptions);
        System.out.println("columnOptions = " + columnOptions );
        System.out.println("actualOptions = " + actualOptions);

        System.out.println("columnOptions.size = " + columnOptions.size());

        Assert.assertEquals(6, columnOptions.size());

    }

    @Given("the user logged in as POS Manager")
    public void theUserLoggedInAsPOSManager() {
        loginPage.login("pos_manager_username", "pos_manager_password");

    }

    @Given("the user logged in as Sales Manager")
    public void theUserLoggedInAsSalesManager() {
        loginPage.login("sales_manager_username", "sales_manager_password");

    }
}


