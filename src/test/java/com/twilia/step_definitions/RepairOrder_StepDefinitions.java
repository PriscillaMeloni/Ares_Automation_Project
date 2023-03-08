package com.twilia.step_definitions;

import com.twilia.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RepairOrder_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    RepairOrder_StepDefinitions repairOrder_stepDefinitions = new RepairOrder_StepDefinitions();


    @Given("user is already logged in as {string}")
    public void user_is_already_logged_in_as(String string) {

    }

    @When("{string} clicks on Repairs")
    public void clicks_on_repairs(String string) {

    }

    @When("once clicked Repair Reference checkbox")
    public void once_clicked_repair_reference_checkbox() {

    }

    @Then("all repair orders are checked as well")
    public void all_repair_orders_are_checked_as_well() {

    }
}