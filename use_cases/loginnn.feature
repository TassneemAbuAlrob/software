#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Admin login
	Description: The admin logs into the e-library 
	Actor: Admin
	
Scenario: Admin can login
	Given that the admin is not logged in
	And the password is "adminAhmad"
	And the username is "ahmad"
	Then the admin login succeeds
	And the admin is logged in
	
Scenario: Admin has the wrong password
	Given that the admin is not logged in
	And the password is "admin434"
	Then the admin login fails
	And the admin is not logged in

	
	Scenario: Admin has the wrong username
	Given that the admin is not logged in
	And the username is "muna"
	Then the admin login fails
	And the admin is not logged in
	

	