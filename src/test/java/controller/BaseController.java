package controller;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.WebDriver;

public class BaseController {

	protected WebDriver driver = getDriver();
	protected ActController actController = new ActController(driver);
	protected VerifyController verifyController = new VerifyController(driver);
}
