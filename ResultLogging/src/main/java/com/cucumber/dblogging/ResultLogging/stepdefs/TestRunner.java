package com.cucumber.dblogging.ResultLogging.stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(features = "src/test/resources", glue = {"com.cucumber.dblogging.ResultLogging.stepdefs"}, plugin = "json:target/cucumber-report-feature-composite.json")
public class TestRunner {
private TestNGCucumberRunner testNGCucumberRunner;

@BeforeClass(alwaysRun = true)
public void setUpClass() throws Exception {
    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
}

@Test(groups = "cucumber scenarios", description = "Runs Cucumber scenarios", dataProvider = "scenarios")
public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper 
cucumberFeature) throws Throwable{
testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
}
@DataProvider
public Object[][] scenarios() {
    return testNGCucumberRunner.provideScenarios();
}

@AfterClass(alwaysRun = true)
public void tearDownClass() throws Exception {
    testNGCucumberRunner.finish();
}
 }
