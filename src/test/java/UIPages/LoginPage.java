package UIPages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://magento.softwaretestingboard.com/")
public class LoginPage extends PageObject {
    public void clickLoginButton() {
        //$(By.linkText("Sign")).waitUntilEnabled();
        $("//header/div[1]/div[1]/ul[1]/li[2]/a[1]").click();
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
