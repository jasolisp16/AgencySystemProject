/**
 * 
 */
package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class AddNewRoomPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/div/ul")
	private WebElement roomInfoTabs;
	
	//General
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen1\"]")
	private WebElement roomTypeDiv;
	
	@FindBy(xpath = "/html/body/div[5]/ul")
	private WebElement roomTypeSelect;
	
	@FindBy(xpath = "/html/body/div[5]/div/input")
	private WebElement roomTypeInput;
	
	@FindBy(id = "cke_1_contents")
	private WebElement roomDescription;
	
	@FindBy(name = "basicprice")
	private WebElement basicPriceInput;
	
	@FindBy(name = "quantity")
	private WebElement quantityInput;
	
	@FindBy(name = "minstay")
	private WebElement minStayInput;
	
	@FindBy(name = "adults")
	private WebElement maxAdultsInput;
	
	@FindBy(name = "children")
	private WebElement maxChildrenInput;
	
	@FindBy(name = "extrabeds")
	private WebElement extraBedsInput;
	
	@FindBy(name = "bedcharges")
	private WebElement bedChargesInput;
	
	//Amenities
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[1]/label/div")
	private WebElement selAllAmenitiesCB;
	
	//Translate
	
	//Submit
	@FindBy(id = "add")
	private WebElement saveRoomButton;
	
	public AddNewRoomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void select_elements(String tabName) throws Throwable {
		List<WebElement> options = roomInfoTabs.findElements(By.tagName("li"));
		int o = getOptionIndex(tabName);
		Thread.sleep(2000);
		switch (o) {
		case 0:
			options.get(o).click();
			fillGeneralInfo();
			break;
		case 1:
			options.get(1).click();
			fillAmenitiesInfo();
			break;		
		default:
			options.get(o).click();
			break;
		}		
	}
	
	public void user_submit_room_info() {
		saveRoomButton.click();
	}
	
	
	private void fillGeneralInfo() {
		roomTypeDiv.click();
		//Select roomTypeSel = new Select(roomTypeSelect);
		List<WebElement> roomTypeList = roomTypeSelect.findElements(By.tagName("li"));
		//System.out.println("Size: " + roomTypeList.size());
		Random rrt = new Random();
		int roomtype = rrt.nextInt(roomTypeList.size());
		String tr = roomTypeList.get(roomtype).getText();
		roomTypeInput.sendKeys(tr);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		roomTypeInput.sendKeys(Keys.ENTER);
		roomDescription.click();
		driver.switchTo().activeElement().sendKeys("This is a room description");
		basicPriceInput.sendKeys("120");
		Random rq = new Random();
		int qrooms = 1;//rq.nextInt(5) + 1;
		quantityInput.sendKeys(String.valueOf(qrooms));
		minStayInput.sendKeys("1");
		maxAdultsInput.sendKeys("4");
		maxChildrenInput.sendKeys("2");
		extraBedsInput.sendKeys("2");
		bedChargesInput.sendKeys("100");
	}
	
	private void fillAmenitiesInfo() {
		Random rscb = new Random();
		int sel = rscb.nextInt(2);
		if (sel == 1) {
			selAllAmenitiesCB.click();
		} else {
			selRandomAmenities();
		}
	}
	
	private int getOptionIndex(String op) {
		if (op.equals("General")) {
			return 0;
		}
		else if (op.equals("Amenities")) {
			return 1;
		}		
		else {
			return 2;
		}
	}
	
	private void selRandomAmenities() {
		Random rTotal = new Random();
		boolean repeated;
		List<Integer> amenitiesSel = new ArrayList<>();
		int total = rTotal.nextInt(25) + 6;
		for (int i = 0; i < total; i++) {
			repeated = true;
			while(repeated) {
				String xpath = "";
				Random rams = new Random();
				int amSel = rams.nextInt(36) + 4;
				if (amenitiesSel.isEmpty()) {
					repeated = false;
					xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[" + amSel + "]/label/div";
					amenitiesSel.add(amSel);
					driver.findElement(By.xpath(xpath)).click();
				} else if (!amenitiesSel.contains(amSel)) {
					repeated = false;
					xpath = "/html/body/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/div[" + amSel + "]/label/div";
					amenitiesSel.add(amSel);
					driver.findElement(By.xpath(xpath)).click();
				} else {
					repeated = true;
				}
			}
		}
	}
}
