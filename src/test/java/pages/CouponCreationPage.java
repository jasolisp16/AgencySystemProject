package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CouponCreationPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button")
	private WebElement addCouponButton;
	@FindBy(id = "#")
	private WebElement statusSelect;
	@FindBy(name = "rate")
	private WebElement percentageTextBox;
	@FindBy(name = "max")
	private WebElement maxUsesTextBox;
	@FindBy(name = "startdate")
	private WebElement startDateTextBox;
	@FindBy(name = "expdate")
	private WebElement expDateTextBox;
	@FindBy(name = "code")
	private WebElement codeTextBox;
	@FindBy(id = "add")
	private WebElement generateCodeButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/div/div[1]")
	private WebElement hotelCheckBox;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement tourCheckBox;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/div/div[3]")
	private WebElement carCheckBox;
	@FindBy(xpath = "//*[@id=\"s2id_autogen2\"]")  
	private WebElement hotelSelect;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li")
	private WebElement hotelResult;	
	@FindBy(xpath = "//*[@id=\"s2id_autogen4\"]")
	private WebElement tourSelect;
	@FindBy(xpath = "/html/body/div[18]/ul/li")  
	private WebElement tourResult;
	@FindBy(xpath = "//*[@id=\"s2id_autogen6\"]")
	private WebElement carSelect;
	@FindBy(xpath = "/html/body/div[19]/ul/li")  
	private WebElement carResult;
	@FindBy(css = ".submitcoupon")
	private WebElement submitButton;
	@FindBy(xpath = "//*[@id=\"ADD_COUPON\"]/div[2]/div/div[1]/button")
	private WebElement closeButton;  
	@FindBy(css = "a.btn-danger:nth-child(1)")
	private WebElement logoutButton;
	
	public CouponCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void he_add_a_new_coupon() throws Throwable {
		addCouponButton.click();
	}
	
	public void he_provides_the_status_as(String status) throws Throwable {
		Select dropdown = new Select(statusSelect);
		dropdown.selectByVisibleText(status);	
	}
	
	public void he_provides_the_percentage_as(String percentage) throws Throwable {
		percentageTextBox.sendKeys(percentage);
	}
	
	public void he_provides_the_max_use_as(String maxUse) throws Throwable {
		maxUsesTextBox.sendKeys(maxUse);
	}
	
	public void he_provides_the_start_day_as(String startDay) throws Throwable {
		Thread.sleep(1000);
		startDateTextBox.sendKeys(startDay);
		startDateTextBox.click();
	}
	
	public void he_provides_the_exp_day_as(String expDay) throws Throwable {
		Thread.sleep(1000);
		expDateTextBox.sendKeys(expDay);
		expDateTextBox.click();
	}
	
	public void he_provides_the_coupon_code_as(String code) throws Throwable {
		codeTextBox.sendKeys(code);
	}
	
	public void he_provides_the_hotel_as(String hotel) throws Throwable {
		hotelSelect.sendKeys(hotel);
		hotelResult.click();
	}
	
	public void he_provides_the_tour_as(String tour) throws Throwable {
		tourSelect.sendKeys(tour);
		tourResult.click();
	}
	
	public void he_provides_the_car_as(String car) throws Throwable {
		carSelect.sendKeys(car);
		carResult.click();
	}
	
	public void he_checks_all_hotels() throws Throwable {		
		hotelCheckBox.click();	
	}
	
	public void he_checks_all_tours() throws Throwable {		
		tourCheckBox.click();	
	}
	
	public void he_checks_all_cars() throws Throwable {		
		carCheckBox.click();	
	}

	public void he_generates_a_coupon_code() throws Throwable {
		generateCodeButton.click();
	}

	public void he_submits() throws Throwable {
		submitButton.click();
	}
	
	public void couponCreated() throws Throwable {
		closeButton.click();
		driver.navigate().refresh();
		logoutButton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
