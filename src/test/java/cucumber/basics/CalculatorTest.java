package cucumber.basics;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/basics"},
        plugin = {"html:target/site/cucumber-html-reports",
                "json:target/cucumber.json"},
        tags = {"~@ignore"})
public class CalculatorTest {
}