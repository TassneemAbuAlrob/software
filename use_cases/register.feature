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
@tag
Feature: Registration for users

Scenario: User registered successfully
    Given The Admin is logged in
    And The user with id "1", name "tassneem" ,email "tassneem@gmail.com",address "jenin",password "1234"
    When The user with id  "1" try to register
    Then The user with id "1", name "tassneem" ,email "tassneem@gmail.com",address "jenin",password "1234" is register successfully in clinc
 
 Scenario: User already registered
    Given The Admin is logged in
    And The user with id "1", name "tassneem" ,email "tassneem@gmail.com",address "jenin",password "1234"
    When The user id is "1" 
    Then The user is already registered
    
  Scenario: Pull user registration
    Given The Admin is logged in 
    And The user with id "7",name "shahd"
    When The Admin unregister the user 
    Then The user is unregister
    
    
 Scenario: User not registered successfully
    Given The Admin is not logged in 
    And The user with id "2", name "masa" ,email "masa@gmail.com",address "tullkarm",password "4321"
      When The user with id  "2" try to register  
    Then The user is not registered in clinc 
    