/**
 * 
 */
package utils;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class DriverFactory {
	
	protected static WebDriver driver;
	
	public DriverFactory() {
		initialize();
	}
	
	public void initialize() {
		if(Objects.equals(driver, null)) {
			createNewDriverInstance();
		}
	}
	
	private void createNewDriverInstance() {
		String browser = new PropertyReader().readPrpoerty("browser");
		String projectPath = getProjectPath();
		if (browser.equals("firefox")) {			
			System.setProperty("webdriver.gecko.driver", projectPath+"\\src\\lib\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath+"\\src\\lib\\edgedriver\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("can't read browser type");
		}
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void destroyDriver() {
		driver.quit();
		driver = null;
	}
	
    public String getProjectPath() {
        String projectLocation = System.getProperty("user.dir");
        return projectLocation;
    }

}
