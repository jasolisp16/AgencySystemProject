#Author: mario.celis@4thsource.com

@Book
Feature: User booking
  User logs in to book in a previously created hotel.

  @Book-CreatedHotel
  Scenario: User with credentials attemps to book into a recently created hotel
  	Given User enters to landingPage
  	And User access UserLogPage
  	And User enter with email as user@phptravels.com
  	Then User is redirected to userhomepage, clicks to hotel
  	
  	And User enters city
  	And User picks check in and check out date
  	Then User searches hotel
  	
  	And User views facilities
  	And User views hotel
  	Then User enters hotel details page
  	
  	And User selects availvable room
  	And User applies cupon if available
  	Then User is redirected to confirmPage
  	
  	And User confirms booking
  	Then User goes to my account
 
  	Then User should see hotel booking
  
  	
  

  
