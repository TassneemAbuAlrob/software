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
Feature: User Add Services
  
  Background:
     | medical imaging        | 10 | "2" |
     | MRI                    | 40 | "1" |
     | medical examinations   | 30 | "3" |
    
  Scenario: user add service successfully
Given the user with id "1" is registerd
When  the user choose service from  
     | medical imaging        | 10 | "2" |
     | MRI                    | 40 | "1" |
     | medical examinations   | 30 | "3" |    
And the user select service with name "medical imaging",price 10,id "2" 
Then this service is added
     
 Scenario: Cancel added service  Given the user with id "1" is registerd
When  the user try to cancel the service with name "medical imaging",price 10,id "2"
 Then this service is canceled