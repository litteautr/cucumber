package cucumber.basics;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CalculatorRunSteps {

    private int total;
    private Calculator calculator;

    @Before
    void init() {
        total = -999;
    }

    @Given("^I have a calculator$")
    public void initializeCalculator() {
        calculator = new Calculator();
    }

    @When("^I add (-?\\d+) and (-?\\d+)$")
    public void testAdd(int num1, int num2) {
        total = calculator.add(num1, num2);
    }

    @Then("^the result should be (-?\\d+)$")
    public void validateResult(int result) {
        assertEquals(total, result);
    }
}