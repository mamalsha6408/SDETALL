package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    @Given("user in login page")
    public void user_in_login_page() {
        System.out.println("Inside Step - user in login page");

    }
    @Given("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("Inside Step - user enter username and password");
    }
    @When("user click login button")
    public void user_click_login_button() {
        System.out.println("Inside Step - user click login button");
    }
    @Then("user navigate to home page")
    public void user_navigate_to_home_page() {
        System.out.println("Inside Step - user navigate to home page");
    }

}
