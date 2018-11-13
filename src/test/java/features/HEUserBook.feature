#Author: mario.celis@4thsource.com

@HEBook
Feature: User booking
  User logs in to book in a previously created hotel.

  @UserBookingHE
  Scenario: User with credentials attemps to book into a recently created hotel
  	Given User enters to landingPage
  	And User access UserLogPage
  	And User enter with email as user@phptravels.com
  	Then User is redirected to userhomepage, clicks to hotel
  	
  	And User selects city
  	And User picks check in and check out date
  	Then User searches hotel and is redirected to hotel options
  	
  	And User selects hotel
  	And User selects availvable room
  	Then User is redirected to confirmPage
  	
  	Then User confirms booking
  	
  

  
