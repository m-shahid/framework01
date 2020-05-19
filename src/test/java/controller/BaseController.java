package controller;

import static core.DriverFactory.getDriver;
import static core.WaitHelper.getWaitHelper;

import org.openqa.selenium.WebDriver;

import core.WaitHelper;

public class BaseController {

	protected WebDriver driver = getDriver();
	protected WaitHelper wait = getWaitHelper();
	protected ActController actController = new ActController(driver, wait);
	protected VerifyController verifyController = new VerifyController(driver, wait);
}
