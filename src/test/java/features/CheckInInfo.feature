#Author: mario.celis@4thsource.com

@CheckInfo
Feature: User should view his checkin information

  @CheckInfo-Hotel
  Scenario: The user should've have booked previously and can verify his information with in his account
  
    Given The user just booked in a hotel
    And User access UserLogPage
  	And User enter with email as user@phptravels.com
  	Then User should see hotel booking