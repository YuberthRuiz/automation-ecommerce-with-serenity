package Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        plugin = {"pretty"}
        ,features = "src/test/resources/features/login_in_the_ecommerce.feature"
        ,glue={"StepDefinitions"}
)
public class LoginRunner {
}
