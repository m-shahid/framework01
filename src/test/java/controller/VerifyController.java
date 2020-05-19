package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import core.WaitHelper;

public class VerifyController {

	private WebDriver driver;
	private WaitHelper wait;
	
	public VerifyController(WebDriver driver, WaitHelper wait) {
		this.driver = driver;
		this.wait = wait;
	}	
	
	public void elementTextShouldBe(WebElement element, String text) {
		wait.waitTillElementIsVisible(element);
		Assert.assertEquals(element.getText(), text);
	}
	
	public void pageTitleShouldContains(String pageTitle) {
		wait.waitTillPageTitleContains(pageTitle);
		Assert.assertTrue(driver.getTitle().contains(pageTitle));
	}
}
