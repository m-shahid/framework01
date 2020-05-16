package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {

	public static WebDriver driver;
	
	@BeforeSuite
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\02 personal\\Learning\\Shahid\\Frameworks\\framework01\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void cleanup() {
		driver.close();
	}
}
