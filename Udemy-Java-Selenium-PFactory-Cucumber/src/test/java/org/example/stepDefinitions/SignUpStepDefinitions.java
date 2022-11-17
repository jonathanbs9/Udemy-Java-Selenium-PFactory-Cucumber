package org.example.stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.builders.data.UserBuilder;
import org.example.conf.DriverConfig;
import org.example.tasks.NavigateTo;
import org.example.tasks.UserSignUp;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefinitions {
    @Autowired
    private UserSignUp signUp;

    @Autowired
    private NavigateTo navigateTo;

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() {
        navigateTo.signUpPage();

    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws InterruptedException {
        signUp.withInfo(UserBuilder
                            .anUser()
                        .but()
                        .withOutLastName()
                            //.withDefaultInfo()
                            .build()
        );
        Thread.sleep(7000);
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);

    }
}
