package testNGstepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;

public class Step {
	public static WebDriver driver=TestRunner.driver;
	
	@Given("^user is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
		System.out.println("done");
	}

	@When("^When user enters the valid username and password$")
	public void when_user_enters_the_valid_username_and_password() throws Throwable {
		System.out.println("done");
	}

	@Then("^user should see the homepage$")
	public void user_should_see_the_homepage() throws Throwable {
		System.out.println("done");
	}
}
