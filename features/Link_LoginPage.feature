@FeatureGroup_Requirement
Feature: feature to test login functionality

@SmokeTest
 Scenario: Validate login is successful with valid credentials
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  
@SmokeTest
 Scenario: Validate login functionality without user credentials
  Given User is on login page
  When User without enters username and password
  And Clicks on login button
  Then validation message should be displayed

@SmokeTest
 Scenario: Validate login is unsuccessful with invalid username credentials
  Given User is on login page
  When User enters invalid username and valid password
  And Clicks on login button
  Then Incorrect User Name validation message should be displayed
  
@SmokeTest
 Scenario: Validate login is unsuccessful with invalid password credentials
  Given User is on login page
  When User enters valid username and invalid password
  And Clicks on login button
  Then Incorrect Password validation message should be displayed
  
@SmokeTest
 Scenario: Validate passwordhelp link in login page
  Given User is on login page
  When User clicks on passwordhelp link
  Then User navigated to the Password Help page