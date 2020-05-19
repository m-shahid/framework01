package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.WaitHelper;

public class ActController {
	
	private WebDriver driver;
	private WaitHelper wait;
	
	public ActController(WebDriver driver, WaitHelper wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void click(WebElement element) {
		try {
			wait.waitTillElementTeBeClickable(element);
			element.click();
		}catch(Exception e) {
			System.out.println("Error occured while clicking on web element : " + e.getMessage());
		}
	}
	
	public void sendkeys(WebElement element, String text) {
		try {
			wait.waitTillElementIsVisible(element);
			element.sendKeys(text);
		}catch(Exception e) {
			System.out.println("Error occured while entering text on web element : " + e.getMessage());
		}
	}
	
	public WebElement findElement(By locator) {
		try {
			wait.waitTillElementIsVisible(locator);
			return driver.findElement(locator);
		}catch(Exception e) {
			System.out.println("Error occured while finding the element" + e.getMessage());
			return null;
		}
	}
	
	

}
