package com.vytrack.steps_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("qa3");
        Driver.getDriver().get(URL);
    }
    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login as sales manager");
        loginPage.login("salesmanager110", "UserUser123");
    }
    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager(){
        loginPage.login("storemanager85", "UserUser123");
    }
    @When("user logs in as a driver")
    public void user_logs_in_as_a_driver() {
        System.out.println("Login as a driver");
        loginPage.login("user15", "UserUser123");
    }

    @Then("user should verify that title is Dashboard")
    public void user_should_verify_that_title_is_Dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verify page title");
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
        Driver.closeDriver();
    }

}
