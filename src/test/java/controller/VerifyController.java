package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VerifyController {

	private WebDriver driver;
	
	public VerifyController(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void elementTextShouldBe(WebElement element, String text) {
		Assert.assertEquals(element.getText(), text);
	}
	
	public void pageTitleShouldContains(String pageTitle) {
		Assert.assertTrue(driver.getTitle().contains(pageTitle));
	}
}
