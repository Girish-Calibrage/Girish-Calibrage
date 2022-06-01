@FeatureGroup_Requirement
Feature: feature to test Records SignOff in Link

@SmokeTest
 Scenario: Validate Records were signedoff in Link
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  And User click on Record Under Hamburger in Link HomePage
  Then User click on Three months under Record Page
  And User click on SignOff under Verify of Record Page
  Then User select CheckBox Of First Record and SignOff The Record
  And User click on None under Verify of Record Page
  Then User Validate Record is Signed by Filtering the Record in Record Search
  
@SmokeTest
Scenario: Validate Records were card in Link
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  And User click on Record Under Hamburger in Link HomePage
  Then User click on Three months under Record Page
  And User click on Card view button Record Page
  And User click on Record Number in Card view page
  And User click on close icon
  #And User click on Expand icon in Record in Card view page
  
@SmokeTest
Scenario: Validate expand icon and Related programs in the Card
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  And User click on Record Under Hamburger in Link HomePage
  Then User click on Three months under Record Page
  And User click on Card view button Record Page
  And User click on Record Number in Card view page
  And User click on close icon
  #And User click on Record ID with link in Card view page
  #And User click on Expand icon in Record in Card view page
  #And User click on Record ID with link in Card view page
  
  
@SmokeTest11
Scenario: Validate Record Details in card View Page 
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And  User click on Link under Hamburger icon in webpage
  And  User click on Record Under Hamburger in Link HomePage
  Then User click on Three months under Record Page
  And User click on Card view button Record Page
  And User click on Record by filtering OEE Events
  And User click on close icon
  And User Click on Record Icon in card view page
  And User Able to see the elements in the popup page in card view page
  And User click on sign icon without entering data 
  And User click on Downloadicon in popup page
  And User click on edit icon and cancel button in popup page
  And User click on history icon and close icon in popup page
  
@SmokeTest1
Scenario: Validate Record link in card View Page 
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And  User click on Link under Hamburger icon in webpage
  And  User click on Record Under Hamburger in Link HomePage
  Then User click on Three months under Record Page
  And User click on Card view button Record Page
  And User click on Record by filtering OEE Events
  And User click on close icon
  And User click on Record to validate the pdf button
  And User click on pdf to Print Record in card view page
 
 #GRID

 @SmokeTest3
 Scenario: Validate All the fields in the Grid view in Records Page
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  And User click on Record Under Hamburger in Link HomePage
  Then User verify all the fields in the Grid view Page
  And User Verify all fields in group and verify dropdown in Grid view Page
