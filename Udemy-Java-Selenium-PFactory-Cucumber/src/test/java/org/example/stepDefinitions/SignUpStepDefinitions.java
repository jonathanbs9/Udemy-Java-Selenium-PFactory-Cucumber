package org.example.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.example.pageObjects.SignUpPage;
import org.example.pageObjects.SignUpService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefinitions {

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        SignUpService signUpPage = new SignUpService(driver);
        signUpPage.navigate("https://demo.automationtesting.in/Register.html");
        signUpPage.writeFirstName("Test");
        signUpPage.writeLastName("Automation");
        signUpPage.writeEmail("test.automation@gmail.com");
        signUpPage.writePhone("1234567890");
        signUpPage.selectGenderMale();
        signUpPage.clickSubmit();
    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
