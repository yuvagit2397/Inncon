package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_Practice {
	
	@Given("^this is Given$")
	public void this_is_Given() throws Throwable {
		System.out.println("Given");
	}

	@When("^This is When$")
	public void this_is_When() throws Throwable {
		System.out.println("When");
	}

	@When("^This is And$")
	public void this_is_And() throws Throwable {
		System.out.println("And");
	}

	@Then("^This is Then$")
	public void this_is_Then() throws Throwable {
		System.out.println("Then");
	}
	
	@Given("^Background given$")
	public void background_given() throws Throwable {
		System.out.println("Background given ");
	}

}
