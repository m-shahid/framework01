package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import static core.DriverFactory.getDriver;

public class BaseTest {

	WebDriver driver;
	
	@BeforeSuite
	public void startUpBrowser(){

		driver = getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@BeforeMethod
	public void goToHome(){
		driver.get("http://www.google.com");
	}

	@AfterSuite(alwaysRun = true)
	public void closeBrowser(){
		driver.close();
	}
}
