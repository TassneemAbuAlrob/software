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
Feature: Add an appointment

  @tag1
  Scenario: Add an appointment successfully
  Given that the admin is logged in
   And the appointment with section "emergency",time "11:00",username "tassneem" ,day 26,month 10 ,week 2
    When the appointment is added
    Then the appointment with section "emergency",time "11:00",username "tassneem",day 26,month 10,week 2 is booked in clinic

 Scenario: Could not add an appointment successfully
	Given that the admin is not logged in
  And the appointment with section "eye-section",time "12:00",username "shahd",day 22,month 12 ,week 1
  When the appointment is added
  Then the appointment is not booked in clinic
 
 Scenario: Time is reserved for another appointment
	Given that the admin is logged in
  And the appointment with section "emergency",time "11:00",username "masa",day 26,month 10 ,week 2
  When the appointment with section "emergency",time "11:00",day 26,month 10 ,week 2 is added
  Then the time of this appointment reserved for another appointment
  
   Scenario: Edit an appointment successfully
  Given that the admin is logged in
   And the appointment with section "emergency",time "11:00",username "tassneem",day 26,month 10 ,week 2
    When the user with username "tassneem" want to change the date of appointment to day 23, month 11 ,week 4
    Then the appointment with section "emergency",time "11:00",username "tassneem",day 26,month 10,week 2 is edited to section "emergency",time "11:00",username "tassneem",day 23,month 11,week 4
    
  Scenario: Delete an appointment successfully
  Given that the admin is logged in
   And the appointment with section "emergency",time "11:00",username "tassneem" ,day 26,month 10 ,week 2
    When the appointment is deleted
    Then the appointment with section "emergency",time "11:00",username "tassneem",day 26,month 10,week 2 is deleted in clinic
    
 
  Scenario: Search for an appointment successfully
  Given that the admin is logged in
   And the appointment with username "tassneem" 
    When the admin is searched for appointment with username "tassneem"
    Then the appointment with section "emergency",time "11:00",username "tassneem",day 26,month 10,week 2 is exist in clinic 
    
    
    