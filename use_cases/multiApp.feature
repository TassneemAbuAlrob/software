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
Feature: user can book multi appointments
user can book at maximum 3 appointments in a week
	Background:
  | eye-section|   "2:00"|   12   | 2    | 11    | 
  | emergency  |  "3:00" |   13   | 2    | 11    |
  | children   |  "11:00 |  26    | 4    | 10    |
  | Orthopedic | "10:00" |  29    | 4    | 10    |
  | Orthopedic | "12:00" |  30    | 4    | 10    |
  | children   |  "4:00" |  26    | 4    | 10    |
  | eye-section|  "9:00" |   12   | 2    | 11    | 
  | emergency  |  "4:00" |   23   | 4    | 11    |
  
  
  

  Scenario: booked multi appointments successfully
    Given the user with id "1" is registerd
    When the user choose 2 to 3 appointments from 
  | eye-section|   "2:00"|   12   | 2    | 11    | 
  | emergency  |  "3:00" |   13   | 2    | 11    |
  | children   |  "11:00 |  26    | 4    | 10    |
  | Orthopedic | "10:00" |  29    | 4    | 10    |
  | Orthopedic | "12:00" |  30    | 4    | 10    |
  | children   |  "4:00" |  26    | 4    | 10    |
  | eye-section|  "9:00" |   12   | 2    | 11    | 
  | emergency  |  "4:00" |   23   | 4    | 11    |
  
And the user select appointment with section "children", time "4:00", day 26,week 4,month 10 
 And appointment with section "Orthopedic", time "12:00", day 30,week 4,month 10
  Then these appointments are booked 
 
 
   Scenario: can not booked multi appointments 
  Given the user with id "2" is not registered
  When the user try to book multi appointments
  Then the user can not book multi appointments
  
  Scenario: booked more than 3 appointments
     Given the user with id "1" is registerd
    When the user choose more than 3 appointments from 
  | eye-section|   "2:00"|   12   | 2    | 11    | 
  | emergency  |  "3:00" |   13   | 2    | 11    |
  | children   |  "11:00 |  26    | 4    | 10    |
  | Orthopedic | "10:00" |  29    | 4    | 10    |
  | Orthopedic | "12:00" |  30    | 4    | 10    |
  | children   |  "4:00" |  26    | 4    | 10    |
  | eye-section|  "9:00" |   12   | 2    | 11    | 
  | emergency  |  "4:00" |   23   | 4    | 11    |
  
  
  And the user select appointments with number 6
  Then the user exceeded the number of appointments,so the appointments are not booked
  
  
  Scenario: delete an appointment from the multi appointments
  Given the user with id "1" is register
  When the user is already booked these appointments
  | emergency  |  "3:00" |   13   | 2    | 11    |
  | children   |  "11:00"|  26    | 4    | 10    |
  | Orthopedic | "10:00" |  29    | 4    | 10    |
  
  And the user needs to delete appointment with section "children", time "11:00", day 26,week 4,month 10 
  Then this appointment is deleted
 
 
 
   Scenario: update the time of an appointment
     Given the user with id "1" is registerd
     When the user is already booked an appointment with section "children", time "11:00", day 26,week 4,month 10 
     And the user want to change the time of appointment with section "children", time "11:00", day 26,week 4,month 10 to time "4:00"
     Then this appointment is updated
     
 
 