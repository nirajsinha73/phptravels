package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		System.out.println("hi");

	}

	@When("^User validate home page title$")
	public void user_validate_home_page_title() throws Throwable {

	}

	@Then("^User should be enter user name and password$")
	public void user_should_be_enter_user_name_and_password() throws Throwable {

	}

	@Then("^user should be succesfully Login$")
	public void user_should_be_succesfully_Login() throws Throwable {

	}
}
