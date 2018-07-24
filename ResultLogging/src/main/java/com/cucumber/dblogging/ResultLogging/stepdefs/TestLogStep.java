package com.cucumber.dblogging.ResultLogging.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class TestLogStep {
	
    @Given("^A test is run$")
    public void a_test_is_run() throws Throwable {
       System.out.println("scenario 1 step1");
    }

    @When("^the test is passed$")
    public void the_test_is_passed() throws Throwable {
    	System.out.println("scenario 1 step2");
    }

    @When("^the test is failed$")
    public void the_test_is_failed() throws Throwable {
    	System.out.println("scenario 1 step3");
    }
    
    @Given("^A failed test is run$")
    public void a_failed_test_is_run() throws Throwable {
    	System.out.println("scenario 2 step1");
    }


    @Then("^the passed test is logged$")
    public void the_passed_test_is_logged() throws Throwable {
    	System.out.println("scenario 2 step2");
    }

    @Then("^the failed test is logged$")
    public void the_failed_test_is_logged() throws Throwable {
    	System.out.println("scenario 2 step3");
    }

}