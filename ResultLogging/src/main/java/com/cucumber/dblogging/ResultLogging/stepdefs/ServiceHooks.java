package com.cucumber.dblogging.ResultLogging.stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {
	   public static Scenario scenario;
	  

	@Before
	    public void initializeTest(Scenario scenario){
	       System.out.println("In cucumber before");
	       this.scenario = scenario;
	       
	    }
	 
	@After
	    public void embedScreenshot(Scenario scenario) {
	        if (scenario.isFailed()) {
	            try {
	                System.out.println("In cucumber After");
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

