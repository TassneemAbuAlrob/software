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

Feature: Manage Services      
      
 Scenario: Add service successfully
    Given The Admin is logged in
    When  admin try to add service with name "MRI", price 40, id "1"
    Then the service added successfully

Scenario: delete service successfully
    Given The Admin is logged in
    When  admin try to delete service with name "medical imaging", price 10,id "2"
    Then the service deleted successfully
    
    
Scenario: Update service price successfully
    Given The Admin is logged in
    When  admin try to update service with name "MRI", price 40, id "1" to service with name "MRI", price 60, id "1"
    Then the service updated successfully
 
 
