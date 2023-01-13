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
Feature:When the user arrives at the clinic, the appointment will be converted to visit and the
user can add notes on each visit.
	Background:
  | eye-section|   "2:00"|   12   | 2    | 11    | 
  | emergency  |  "3:00" |   13   | 2    | 11    |
  | children   |  "11:00 |  26    | 4    | 10    |
  | Orthopedic | "10:00" |  29    | 4    | 10    |
  | Orthopedic | "12:00" |  30    | 4    | 10    |
  | children   |  "4:00" |  26    | 4    | 10    |
  | eye-section|  "9:00" |   12   | 2    | 11    | 
  | emergency  |  "4:00" |   23   | 4    | 11    |
  
  @tag1
  Scenario: the appointment was changed to a visit successfully
    Given the user with id "1" is arrived at the clinic on the specific time
   
    When the user come to the appointment with section "eye-section",time "2:00", day 12 ,week 2, month 11 
    Then the appointment converted to visit
    

Scenario: The appointment was not converted to a visit because the user did not come to to the appointment.
   Given the user with id "1" not arrived at the clinic on the specific time
     When the user  did not come to the appointment with section "emergency",time "3:00", day 13 ,week 2, month 11 
      
     Then the appointment not converted to visit 
     
     
     Scenario: he appointment was changed to a visit successfully and the user write a note
    Given the user with id "1" arrived at the clinic on the specific time
   
    When the user come to the second appointment with  section "Orthopedic", time "12:00", day 30,week 4,month 10 
    And the user write a note the service was good
    Then the appointment converted to visit successfully and the user write a note
    