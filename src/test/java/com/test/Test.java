package com.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	 System.out.println(arg1);
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	 System.out.println(arg1);
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    System.out.println("End");
	}

}
