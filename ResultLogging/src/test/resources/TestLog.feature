Feature: Testing the ResultLogging Feature

Scenario: Test if passed test is logged properly
Given A test is run 
When the test is passed
Then the passed test is logged

Scenario: Test if failed test is logged properly
Given A failed test is run 
When the test is failed
Then the failed test is logged