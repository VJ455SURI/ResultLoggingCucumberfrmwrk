package com.cucumber.dblogging.ResultLogging.Utilities;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.cucumber.dblogging.ResultLogging.stepdefs.ServiceHooks;

public class ResultLogListener extends TestListenerAdapter {

	@Override
	public void onTestSuccess(ITestResult tr) {
		String rawFeatureName = ServiceHooks.scenario.getId().split(";")[0];
	    
		DBConnections.InsertToDB(ServiceHooks.scenario.getName(), rawFeatureName, ServiceHooks.scenario.getStatus().toString());
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		String rawFeatureName = ServiceHooks.scenario.getId().split(";")[0];
	    
		DBConnections.InsertToDB(ServiceHooks.scenario.getName(), rawFeatureName, ServiceHooks.scenario.getStatus().toString());

		}

	@Override
	public void onTestSkipped(ITestResult tr) {
		String rawFeatureName = ServiceHooks.scenario.getId().split(";")[0];
	    
		DBConnections.InsertToDB(ServiceHooks.scenario.getName(), rawFeatureName, "SKIPPED");

	}

	
}

