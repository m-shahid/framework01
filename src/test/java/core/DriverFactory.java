package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;
	
	private DriverFactory() {
		//prevent creating multiple instances
	}
	
	public static WebDriver getDriver() {
		
		if(driver == null) {
			
			String currentUserDirectory = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",currentUserDirectory + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		return driver;
	}
}
