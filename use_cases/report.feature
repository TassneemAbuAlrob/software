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
Feature: create report for clients
 
Feature: Report for user


Scenario: admin generate user report

 Given the user with id "1" , name "tassneem" ,email "tassneem@gmail.com",address "jenin" is registered
 And the user selected service with name "medical imaging", price 10, id "2"
 When the user selected appointment with section "children", time "4:00", day 26,week 4,month 10 
 Then the report is generated