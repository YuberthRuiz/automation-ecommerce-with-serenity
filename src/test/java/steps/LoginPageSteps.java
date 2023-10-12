package steps;

import uiPages.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.ScenarioActor;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageSteps extends ScenarioActor {
    String actor;
    @Steps(shared = true)
    LoginPage loginPage;

    @Step("#actor enter to the luma ecommerce site")
    public void isOnLoginPage(){
        loginPage.setDefaultBaseUrl("https://magento.softwaretestingboard.com/");
        loginPage.open();
    }
    @Step("#actor click in the login button")
    public void enterInLogin() {loginPage.clickLoginButton();}

    @Step("#actor entered the credentials")
    public void loginAsUser(String user, String password){
        loginPage.doLogin(user,password);
    }

    @Step("#actor should see the title after login")
    public void userShouldBeLogin(){
        assertTrue(loginPage.accountPageIsVisible().contains("Welcome"));
    }

    @Step("#actor should see the error message")
    public void userShouldSeeErrorMessage(){
        assertTrue(loginPage.messageError().contains("The account sign-in was incorrect"));
    }
}
