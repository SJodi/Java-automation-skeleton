package Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Sample {

    @Steps SampleSteps  SampleSteps;
    @Given("user on login page")
    public void user_on_login_page() {
        SampleSteps.user_on_login_page();
    }
    @When("user login with {string} and {string}")
    public void user_login_with_and(String username , String password) {
        SampleSteps.user_login_with_and(username, password);
    }
    @Then("user should be able to log in")
    public void user_should_be_able_to_log_in() {
        SampleSteps.user_should_be_able_to_log_in();
    }
}
