package StepDefinitions;

import Steps.LoginPageSteps;
import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStepDefinitions {
    @Steps(shared = true)
    LoginPageSteps loginPageSteps;
    @Given("the user enter to the luma ecommerce site")
    public void the_user_enter_to_the_luma_ecommerce_site() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.enterInLogin();
        loginPageSteps.loginAsUser();
        loginPageSteps.userShouldBeLogin();
    }
    @When("the user select the product")
    public void the_user_select_the_product() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("create the order")
    public void create_the_order() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the user should the a message with the successful creation")
    public void the_user_should_the_a_message_with_the_successful_creation() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
