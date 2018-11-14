package steps;

import cucumber.api.Format;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CouponCreationPage;
import utils.DriverFactory;

public class CouponCreationSteps extends DriverFactory{

	@And("^he adds a new coupon$")
	public void he_adds_a_new_coupon() throws Throwable {
		new CouponCreationPage(driver).he_add_a_new_coupon();;
	}
	
	@And("^he provides the status as ([^\"]*)$")
	public void he_provides_the_status_as(String status) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_status_as(status);
	}
	
	@And("^he provides the percentage as ([^\"]*)$")
	public void he_provides_the_percentage_as(String percentage) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_percentage_as(percentage);
	}
	
	@And("^he provides the max uses as ([^\"]*)$")
	public void he_provides_the_max_uses_as(String uses) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_max_use_as(uses);
	}
	
	@When("^he provides the start day as (.*)$")
	public void he_provides_the_start_day_as(@Format("dd/MM/yyyy") String start) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_start_day_as(start);
	}
	
	@When("^he provides the exp day as (.*)$")
	public void he_provides_the_exp_day_as(@Format("dd/MM/yyyy")String exp) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_exp_day_as(exp);
	}
	
	@And("^he provides the coupon code as ([^\"]*)$")
	public void he_provides_the_coupon_code_as(String code) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_coupon_code_as(code);
	}
	
	@And("^he provides the hotel assigned as ([^\"]*)$")
	public void he_provides_the_hotel_assigned_as(String hotel) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_hotel_as(hotel);
	}
	
	@And("^he provides the car assigned as ([^\"]*)$")
	public void he_provides_the_car_assigned_as(String car) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_car_as(car);
	}
	
	@And("^he provides the tour assigned as ([^\"]*)$")
	public void he_provides_the_tour_assigned_as(String tour) throws Throwable {
		new CouponCreationPage(driver).he_provides_the_hotel_as(tour);
	}
	
	@And("^he generate the coupon code$")
	public void he_generate_the_coupon_code() throws Throwable {
		new CouponCreationPage(driver).he_generates_a_coupon_code();
	}
	
	@And("^he checks all the hotels$")
	public void he_checks_all_the_hotels() throws Throwable {
		new CouponCreationPage(driver).he_checks_all_hotels();
	}
	
	@And("^he checks all the tours$")
	public void he_checks_all_the_tours() throws Throwable {
		new CouponCreationPage(driver).he_checks_all_tours();
	}
	
	@And("^he checks all the cars$")
	public void he_checks_all_the_cars() throws Throwable {
		new CouponCreationPage(driver).he_checks_all_cars();
	}
	
	@And("^he submits$")
	public void he_submits() throws Throwable {
		new CouponCreationPage(driver).he_submits();
	}
	
	@Then("^he should get his coupon created$")
	public void he_should_get_his_coupon_created() throws Throwable {
		new CouponCreationPage(driver).couponCreated();
	}
	
	
	
	
	
	
}
