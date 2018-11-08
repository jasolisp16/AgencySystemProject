#Author: mario.celis@4thsource.com

@HEBok
Feature: User booking
  User logs in to book in a previously created hotel.

  @UserBookingHE
  Scenario: User with credentials attemps to book into a recently created hotel
  	Given User enter with email as user@phptravels.com and password as demouser
  	Then User is redirected to userpage, clicks to homePage
  	
  	And User selects city
  	And User picks check in date
  	And User picks checkout date
  	And User select amount of adults and childs
  	And User searches hotels
  	Then User is redirected to hotelSelectionPage
  	
  	And User selects availvable rooms
  	Then User is redirected to confirmPage
  	
  	And User confirms booking
  	Then User is redirected to customer unpaidTicketPage
  	
  

  
