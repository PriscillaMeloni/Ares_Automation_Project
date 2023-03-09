package com.twilia.step_definitions;

import com.twilia.pages.LoginPage;
import com.twilia.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RepairOrder_StepDefinitions {

    LoginPage loginPage = new LoginPage();



    @When("once clicked Repair Reference checkbox")
    public void once_clicked_repair_reference_checkbox() {

    }

    @Then("all repair orders are checked as well")
    public void all_repair_orders_are_checked_as_well() {

    }

    @Given("user is already logged in as POSManager")
    public void userIsAlreadyLoggedInAsPOSManager() {
    }

    @When("POS Manager clicks on Repairs")
    public void posManagerClicksOnRepairs() {

    }

    @Given("user is already logged in as SalesManager")
    public void userIsAlreadyLoggedInAsSalesManager() {
    }

    @When("Sales Manager clicks on Repairs")
    public void salesManagerClicksOnRepairs() {
    }
}