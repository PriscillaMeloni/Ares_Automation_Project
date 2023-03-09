package com.twilia.step_definitions;

import com.twilia.pages.TwiliaHomePage;
import com.twilia.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class US05AC01_StepDefinitions {

    @Given("User is logged on the Twilia page")
    public void user_is_logged_on_the_twilia_page() {
        Driver.getDriver().get("https://qa.twiliaerp.com/web/login");
    }

    TwiliaHomePage twiliaHomePage = new TwiliaHomePage();

    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        twiliaHomePage.inputEmail.sendKeys("salesmanager66@info.com");
        twiliaHomePage.inputPassword.sendKeys("salesmanager");
        twiliaHomePage.loginButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }


    @Then("user clicks on Point of Sale tab")
    public void user_clicks_on_point_of_sale_tab() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        twiliaHomePage.pointOfSale.click();
    }
    @When("user clicks on Orders tab")
    public void user_clicks_on_orders_tab() throws InterruptedException {
        twiliaHomePage.orderButton.click();
        Thread.sleep(2000);
    }
    @When("user clicks on Order Ref Checkbox")
    public void user_clicks_on_order_ref_checkbox() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        twiliaHomePage.orderRefButton.click();
        ;
    }
    @Then("all orders are checked")
    public void all_orders_are_checked() {

        List<WebElement> allCheckBoxes = Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 3; i < allCheckBoxes.size(); i++) {
            if (allCheckBoxes.get(i).isEnabled()){

                System.out.println("allCheckBoxes = " + allCheckBoxes + allCheckBoxes.size());
            }

            Assert.assertFalse(allCheckBoxes.isEmpty());
        }

    }

    @Then("user clicks on Action dropdown button")
    public void user_clicks_on_action_dropdown_button() {
        twiliaHomePage.actionButton.click();
    }

    @Then("dropdown has Delete Button")
    public boolean dropdown_has_delete_button() {
        twiliaHomePage.deleteButton.isDisplayed();
        return true;
    }

    @Then("dropdown has Export Button")
    public boolean dropdown_has_export_button() {
        twiliaHomePage.exportButton.isDisplayed();
        return true;
    }



    @Then("dropdown has Import Button")
    public void dropdown_has_import_button() {
        List<WebElement> importButton = Driver.getDriver().findElements(By.xpath("(//button[@aria-expanded='false'])[2]"));
        if(importButton.contains("Import")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is NOT Present");
        }




    }






}
