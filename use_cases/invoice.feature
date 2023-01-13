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
Feature: The user should be able to add an invoice for each visit.
 Background:
     | medical imaging        | 10 | "2" |
     | MRI                    | 40 | "1" |
     | medical examinations   | 30 | "3" |

  @tag1
  Scenario: add an invoce for the visit done successfully
    Given the user with id "1" ,name "tassneem" is registered
    When the user was add this two service "medical imaging",price 10,id "2" and "MRT",price 40,id "1" 
    Then the user finish the invoice
    

 Scenario: add an invoce for the visit can not done successfully
    Given the user with id "2" ,name "masa" is registered in the system
    When the user try to add service not available 
    Then the service will not add 