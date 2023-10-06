package UIPages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("luma.ecommerce")
public class LoginPage extends PageObject {
    public void clickLoginButton() {
        $(By.linkText("Sign")).click();
    }
    public void doLogin(){
        $("#email").sendKeys("yuberth@gmail.com");
        $("#pass").sendKeys("Testing123");
        $("#send2").click();
    }

    public String accountPageIsVisible(){
        return $("//span[contains(text(),'My Account')]").getText();
    }
}