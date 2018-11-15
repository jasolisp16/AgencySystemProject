@Test2
Feature:
	As an admin
	I want to be able to add hotels, tours or cars in the coupon creation.
	So that i can use the coupon to get a discount in a booking.
	
Scenario: Adding hotel, car or tour to the coupon.
	Given the user is on admin login page
	And he provides the email as admin@phptravels.com
	And he provides the password as demoadmin
	When he chooses to login
	And he continues to Coupons menu
	And he adds a new coupon
	And he provides the status as Enable
	And he provides the percentage as 20
	And he provides the max uses as 1
	And he provides the start day as 11/11/2018
	And he provides the exp day as 15/11/2018
	And he provides the coupon code as 4THSRC
	And he provides the hotel assigned as Rendezvous Hotels
	And he submits	
	Then he should get his coupon created