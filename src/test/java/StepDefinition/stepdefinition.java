package StepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefinition {

    @Given("^user is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("user is on netbanking landing page");
    }

    @When("^User login into application with Username & Password$")
    public void user_login_into_application_with_username_password() throws Throwable {
    	System.out.println("User login into application with Username & Password");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Cards are displayed");    }

}