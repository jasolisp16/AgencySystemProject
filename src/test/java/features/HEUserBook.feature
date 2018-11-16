#Author: mario.celis@4thsource.com

#@Book
Feature: User booking
  A user should be able to book in any hotel given rooms are avaivable,
  user can view his booking within his own account.
  
  @UserBook-InvalidCupon
  	Scenario: User with credentials attemps to book into a recently created hotel with invalid cupon
  #LandingPage
  	Given User enters to landingPage
  #UserLogPage
  	And User access UserLogPage
  	And User enter with email as user@phptravels.com
  	Then User is redirected to userhomepage
  	
  #UserHomePage
  	And User clicks hotel button
  	Then User is redirected
  	
  #LandingPage
  	And User enters city
  	And User picks check in and check out date
  	Then User searches hotel
  	
  #HotelPage
  	And User views facilities
  	Then User selects hotel
  #HotelDetails
  	And User selects availvable room
  	And User is redirected to confirmPage
  #UserConfirmPage
  	And User applies invalid cupon
  	And User confirms booking
  #UserUnpaidBookPage
  	Then User should view ticket
  	Then User goes to landing  
 	#UserHomePage
 		And User goes to my account
  	Then User is redirected to userhomepage
  	Then User should see hotel booking

  
