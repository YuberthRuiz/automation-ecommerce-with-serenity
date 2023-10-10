package UIPages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://magento.softwaretestingboard.com/")
public class LoginPage extends PageObject {
    public void clickLoginButton() {
        $(By.partialLinkText("Sign")).waitUntilEnabled();
        $(By.partialLinkText("Sign")).click();
    }
    public void doLogin(){
        $("#email").sendKeys("yuberth@gmail.com");
        $("#pass").sendKeys("Testing123");
        $("#send2").click();
    }

    public String accountPageIsVisible(){
        return $("div.panel.header ul.header.links li.greet.welcome > span.logged-in").getText();
    }
}
