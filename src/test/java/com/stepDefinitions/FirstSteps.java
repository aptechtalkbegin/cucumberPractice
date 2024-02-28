package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstSteps {
	
	@Given("User launch browser")
	public void user_launch_browser() {
	   System.out.println("welcome");
	}

	@Given("Opens URL {string}")
	public void opens_url(String string) {
	   System.out.println("welcome");
	}

	@When("User navigates to My Account menu")
	public void user_navigates_to_my_account_menu() {
		System.out.println("welcome");
	}

	@When("Click on login")
	public void click_on_login() {
		System.out.println("welcome");
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		System.out.println("welcome");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		System.out.println("welcome");
	}

	@Then("User login is successful")
	public void user_login_is_successful() {
		System.out.println("welcome");
	}

	@Then("User navigates to MyAccount page")
	public void user_navigates_to_my_account_page() {
		System.out.println("welcome");
	}


}
