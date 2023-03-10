package com.twilia.step_definitions;

import com.twilia.pages.LoginPage;
import com.twilia.pages.SalesPage;
import io.cucumber.java.en.*;

public class US10StepDefs {

LoginPage loginPage = new LoginPage();
    @Given("user is already logged in as a POSManager")
    public void userIsAlreadyLoggedInAsAPOSManager() {
        loginPage.login("pos_manager_username", "pos_manager_password");
    }
    SalesPage salesPage = new SalesPage();
    @Then("user should click on Sales module")
    public void user_should_click_on_sales_module() {
        salesPage.salesModule.click();
    }
    @Then("user can click on main Quotation Box")
    public void user_can_click_on_main_quotation_box() {

        salesPage.quotationMainBox.click();
    }
    @Then("user should see all the checkboxes are selected")
    public void user_should_see_all_the_checkboxes_are_selected() {
        salesPage.assertCheckBoxesSelected();
    }

    @Given("user is already logged in as a SalesManager")
    public void userIsAlreadyLoggedInAsASalesManager() {
        loginPage.login("sales_manager_username", "sales_manager_password");
    }
}
