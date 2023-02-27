package com.Twilia.step_definitions;

import com.Twilia.pages.LoginPage;
import com.Twilia.utilities.BrowserUtils;
import com.Twilia.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginStepDefs {

    //>>>>>WE NEED TO CHANGE THIS PAGE, ACCORD WITH OUR FEATURE <<<<<<<<<
/*
    @Then("click on {string} module")
    public void click_on_module(String modules) {
    }

 */
    LoginPage loginPage = new LoginPage();

    @Then("click on all the modules")
    public void clickOnAllTheModules() {
        System.out.println("LoginPage.ListOfModules() = " + loginPage.ListOfModules());
        for (WebElement each : loginPage.ListOfModules()) {
            BrowserUtils.sleep(1);
            each.click();
           /* if (each.getText().equalsIgnoreCase("More")) {
                each.click();
            } else {
                each.click();
            }
            */
        }
    }


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws AWTException, InterruptedException {
        loginPage.login("pos_manager_username", "pos_manager_password");
        BrowserUtils.sleep(2);
        Robot robot = new Robot();
        System.out.println("About to zoom out");
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
/*
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }


 */


    }
}
