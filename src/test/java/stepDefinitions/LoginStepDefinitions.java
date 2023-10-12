package stepDefinitions;

import steps.LoginPageSteps;
import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStepDefinitions {
    @Steps(shared = true)
    LoginPageSteps loginPageSteps;
    @Given("I enter to the luma ecommerce site")
    public void i_enter_to_the_luma_ecommerce_site() {
        loginPageSteps.isOnLoginPage();
    }
    @When("I entered the credentials {string} and {string}")
    public void i_entered_a_valid_credential(String user, String password) {
        loginPageSteps.enterInLogin();
        loginPageSteps.loginAsUser(user,password);
    }
    @Then("I should see the title after login")
    public void i_should_see_the_title_after_login() {
        loginPageSteps.userShouldBeLogin();
    }

    @Then("I should see the error message")
    public void i_should_see_the_error_message() {
        loginPageSteps.userShouldSeeErrorMessage();
    }
}
