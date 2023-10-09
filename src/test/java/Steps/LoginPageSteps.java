package Steps;

import UIPages.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.ScenarioActor;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageSteps extends ScenarioActor {
    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }
    @Step
    public void enterInLogin() {loginPage.clickLoginButton();}

    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLogin(){
        assertTrue(loginPage.accountPageIsVisible().equals("My Account"));
    }

}
