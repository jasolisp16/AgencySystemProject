/**
 * 
 */
package pages;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.CommonUtils;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AddNewHotelPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/div/ul")
	private WebElement listElements;
	
	//General info
	@FindBy(name = "hotelstatus")
	private WebElement hotelStatusSelect;
	
	@FindBy(name = "hotelname")
	private WebElement hotelNameTextBox;
	
	@FindBy(id = "cke_1_contents")
	private WebElement descriptionTextEdit;
	
	@FindBy(name = "hotelstars")
	private WebElement hotelStarsSelect;
	
	@FindBy(name = "hoteltype")
	private WebElement hotelTypeSelect;
	
	@FindBy(name = "isfeatured")
	private WebElement isFeaturedSelect;
	
	@FindBy(name = "ffrom")
	private WebElement finputDate;
	
	@FindBy(name = "fto")
	private WebElement tinputDate;
	
	@FindBy(id = "s2id_searching")
	private WebElement bSearch;
	
	@FindBy(xpath = "/html/body/div[10]/div/input")
	private WebElement inputSearch;
	
	@FindBy(xpath= "/html/body/div[10]/ul")
	private WebElement resultSearch;
	
	@FindBy(name = "deposittype")
	private WebElement depTypeSelect;
	
	@FindBy(name = "depositvalue")
	private WebElement depValueTextBox;
	
	@FindBy(name = "taxtype")
	private WebElement taxTypeSelect;
	
	@FindBy(name = "taxvalue")
	private WebElement taxValueTextBox;
	
	//Facilities
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[1]/label/div")
	private WebElement selAllCheckBox;
	
	//Meta info
	
	@FindBy(name = "hotelmetatitle")
	private WebElement metaTitleInputText;
	
	@FindBy(name = "hotelkeywords")
	private WebElement keywordsTextArea;
	
	@FindBy(name = "hotelmetadesc")
	private WebElement metaDescTextArea;
	
	//Policy
	
	@FindBy(name = "checkintime")
	private WebElement cInTimeInputText;
	
	@FindBy(name = "checkouttime")
	private WebElement cOutTimeInputArea;
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen4\"]")
	private WebElement payOptField;
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen5\"]")
	private WebElement payOptInputField;
//	/html/body/div[2]/div/div/form/div/div[1]/div/div[4]/div[2]/div/select
	@FindBy(xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[4]/div[2]/div/select")
	private WebElement paymentOptionsInput;	
	
	@FindBy(name = "hotelpolicy")
	private WebElement hotelPolicyTextArea;
	
	//Contact
	
	@FindBy(name = "hotelemail")
	private WebElement hotelEmailInputText;
	
	@FindBy(name = "hotelwebsite")
	private WebElement hotelWebsiteInputText;
	
	@FindBy(name = "hotelphone")
	private WebElement hotelPhoneInputText;
	
	//Translate
	
	//Submit
	@FindBy(id = "add")
	private WebElement submitHotelButton;
	
	public AddNewHotelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void select_elements(String tabName) throws Throwable {
		List<WebElement> options = listElements.findElements(By.tagName("li"));
		int o = getOptionIndex(tabName);
		Thread.sleep(2000);
		switch (o) {
		case 0:
			options.get(o).click();
			fillGeneralOptions();
			break;
		case 1:
			options.get(1).click();
			fillFacilitiesOptions();
			break;
		case 2:
			options.get(o).click();
			break;
		case 3:
			options.get(o).click();
			fillPolicyOptions();
			break;
		case 4:
			options.get(o).click();
			fillContactOptions();
			break;
		default:
			options.get(o).click();
			break;
		}
		
	}
	
	public void user_submit_hotel_info() throws Throwable {
		submitHotelButton.click();
	}
	
	private void fillGeneralOptions() {
		CommonUtils utilsDate = new CommonUtils();
		Select hotelStaSel = new Select(hotelStatusSelect);
		Select starSel = new Select(hotelStarsSelect);
		Select typeHotelSel = new Select(hotelTypeSelect);
		Select isFtSel = new Select(isFeaturedSelect);
		Select depTypeSel = new Select(depTypeSelect);
		Select taxTypeSel = new Select(taxTypeSelect);
		if(!hotelStaSel.getOptions().isEmpty()) {
			hotelStaSel.selectByIndex(0);
		}
		hotelNameTextBox.sendKeys("4th Source Premier Inn");
		descriptionTextEdit.click();
		driver.switchTo().activeElement().sendKeys("A nice hotel to rest and have a great time!");
		if (!starSel.getOptions().isEmpty()) {
			Random rstar = new Random();
			starSel.selectByIndex(rstar.nextInt(starSel.getOptions().size()));
		}
		if (!typeHotelSel.getOptions().isEmpty()) {
			Random rtype = new Random();
			typeHotelSel.selectByIndex(rtype.nextInt(typeHotelSel.getOptions().size()));
		}
		if(!isFtSel.getOptions().isEmpty()) {
			isFtSel.selectByIndex(0);
		}
		Date idate = utilsDate.getRandomInitDate();
		Date edate = utilsDate.getRandomEndDate(idate);
		//System.out.println(convertDateToString(idate));
		//System.out.println(convertDateToString(edate));
		finputDate.sendKeys(utilsDate.convertDateToString(idate));
		finputDate.click();
		tinputDate.sendKeys(utilsDate.convertDateToString(edate));
		tinputDate.click();
		bSearch.click();
		inputSearch.sendKeys("Merida");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> resultOptions = resultSearch.findElements(By.tagName("li"));
		System.out.println(resultOptions.size());
		if(!resultOptions.isEmpty()) {
			Random ropt = new Random();
			resultOptions.get(ropt.nextInt(resultOptions.size())).click();
		}
		if (!depTypeSel.getOptions().isEmpty()) {
			Random rdept = new Random();
			depTypeSel.selectByIndex(rdept.nextInt(depTypeSel.getOptions().size()));
		}
		depValueTextBox.sendKeys("10");
		if (!taxTypeSel.getOptions().isEmpty()) {
			Random rtax = new Random();
			taxTypeSel.selectByIndex(rtax.nextInt(taxTypeSel.getOptions().size()));
		}
		taxValueTextBox.sendKeys("8");
	}
	
	private void fillFacilitiesOptions() {
		Random rscb = new Random();
		int click = rscb.nextInt(2);
		if (click == 1) {
			selAllCheckBox.click();
		} else {
			selectRandomAmeneties();
		}		
	}
	
	private void fillPolicyOptions() {
		List<Integer> payOptSel = new ArrayList<>();
		boolean isSelected = true;
		cInTimeInputText.clear();
		cInTimeInputText.sendKeys("12:00 PM");
		cInTimeInputText.sendKeys(Keys.TAB);
		cOutTimeInputArea.clear();
		cOutTimeInputArea.sendKeys("12:00 PM");
		cOutTimeInputArea.sendKeys(Keys.TAB);
		//payOptField.click();
		Select paymentOptions = new Select(paymentOptionsInput);
		System.out.println(paymentOptions.getOptions().size());
		Random toptions = new Random();
		int total = toptions.nextInt(paymentOptions.getOptions().size()) + 1;
		do {
			payOptField.click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//paymentOptions = new Select(paymentOptionsInput);
			System.out.println("size: " + paymentOptions.getOptions().size());
			System.out.println("total: " + total);
			isSelected = true;
			String text = "";
			while(isSelected) {
				Random rop = new Random();
				int opt = rop.nextInt(paymentOptions.getOptions().size());
				if (payOptSel.isEmpty()) {
					isSelected = false;
					payOptSel.add(opt);
					text = paymentOptions.getOptions().get(opt).getText();
				} else if (!payOptSel.contains(opt)) {
					isSelected = false;
					payOptSel.add(opt);
					text = paymentOptions.getOptions().get(opt).getText();
				} else {
					isSelected = true;
				}
			}
			System.out.println(text);
			payOptInputField.sendKeys(text);
			payOptInputField.sendKeys(Keys.ENTER);
			//paymentOptions.getOptions().remove(opt);
			total--;
		} while(total>0);
		hotelPolicyTextArea.sendKeys("Child under 10 years are free of charge (max 2 children).  Cancellation and prepayment policies vary according to room type. Please enter the dates of your stay and check the conditions of your required room. ");
		
	}
	
	private void fillContactOptions() {
		hotelEmailInputText.sendKeys("reservations@myhotel.com");
		hotelWebsiteInputText.sendKeys("myhotel.com");
		hotelPhoneInputText.sendKeys("999 " + createRandomNumber(7));
	}
	
	private int getOptionIndex(String op) {
		if (op.equals("General")) {
			return 0;
		}
		else if (op.equals("Facilities")) {
			return 1;
		}
		else if (op.equals("Meta Info")) {
			return 2;
		}
		else if (op.equals("Policy")) {
			return 3;
		}
		else if (op.equals("Contact")) {
			return 4;
		}
		else {
			return 5;
		}
	}
	
	private void selectRandomAmeneties() {
		Random rtotal = new Random();
		List<Integer> amenitiesSel = new ArrayList<>();
		int total = rtotal.nextInt(10) + 5;
		for (int i=0; i < total; i++) {
			boolean repeated = true;
			while(repeated) {
				String xpath = "";
				Random ramt = new Random();
				int amsel = ramt.nextInt(19) + 4;
				if (amenitiesSel.isEmpty()) {
					repeated = false;
					xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[" + amsel + "]/label/div";
					amenitiesSel.add(amsel);
					driver.findElement(By.xpath(xpath)).click();
				} else if (!amenitiesSel.contains(amsel)) {
					repeated = false;
					xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[" + amsel + "]/label/div";
					amenitiesSel.add(amsel);
					driver.findElement(By.xpath(xpath)).click();
				} else {
					repeated = true;
				}
			}
		}
		
	}
	
	public String createRandomNumber(int size) {
        char[] ch = "0123456789".toCharArray();
        char[] c = new char[size];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < size; i++){
            c[i] = ch[random.nextInt(ch.length)];
        }

        return new String(c);
    }
	
	private static Map<Integer, String> amenetiesMap() {
		return Collections.unmodifiableMap(new HashMap<Integer, String>() {
            {
                put(0, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[4]/label/div");
                put(1, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[5]/label/div");
                put(2, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[6]/label/div");
                put(3, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[7]/label/div");
                put(4, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[8]/label/div");
                put(5, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[9]/label/div");
                put(6, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[10]/label/div");
                put(7, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[11]/label/div");
                put(8, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[12]/label/div");
                put(9, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[13]/label/div");
                put(10, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[14]/label/div");
                put(11, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[15]/label/div");
                put(12, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[16]/label/div");
                put(13, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[17]/label/div");
                put(14, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[18]/label/div");
                put(15, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[19]/label/div");
                put(16, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[20]/label/div");
                put(17, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[21]/label/div");
                put(18, "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[22]/label/div");
            }
        });
    }

}
