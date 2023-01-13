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
Feature: booking appointment

Background:
      | eye-section|   "2:00"|   12   | 2    | 11    |
      | emergency  |  "3:00" |     13 | 2    |11     |

 
  Scenario: book appointment successfully
    Given the user with id "1" is registered
     When the user book an appointment 
      | eye-section|   "2:00" |   12   | 2    | 11    |
      | emergency  |    "3:00"|     13 | 2    |11     |    
  Then  the user booked an appointment with section "eye-section",time"2:00", day 12 ,week 2, month 11
  



  Scenario: can not book an appointment successfully
    Given the user with id "1" is registered
     When the user book an appointment 
      | eye-section|   "2:00" |   12   | 2    | 11    |
      | emergency  |    "3:00"|     13 | 2    |11     |
     And the appointment with section "eye-section",time "1:00", day 12 ,week 2, month 11 is not founded
     Then the user does not book this appointment 
  
  
  
  Scenario:the user is not register
  Given the user with id "2" is not registered
  Then the user can not book any appointment
  
  
  
  
   Scenario: all  appointments are booked
    Given the user with id "1" is registered
    When all appointments are booked
    Then there is no appointments to booked
    
    
    
    
    
    
    
    
    
  

 