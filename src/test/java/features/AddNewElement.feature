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
Feature: 
  As an admin user I want to be able to create a new Hotel
  so the hotel will be visible for client
  
  Background:
  	Given the user is on login page
  	And user provides email as admin@phptravels.com
  	And user provides password as demoadmin
  	When user logs in
  	

  @tag1
  Scenario: Create a new Hotel
    And user select the hotel tab
    And user select add hotel
    And user fill general info
    And user fill facilities info
    And user fill meta info
    And user fill policy info
    And user fill contac info
    And user fill translate info
    And user submit hotel info
    And user select rooms option
    And user select add room
    And user fill room general info
    And user fill room amenities info
    And user fill room translate info
    When user submit room info
    And admin user logs out
    And user visits landing page as a client
    When client searchs for the hotel
    Then hotel should be visible for client
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |

