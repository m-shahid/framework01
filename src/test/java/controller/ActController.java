package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActController {
	
	private WebDriver driver;
	
	public ActController(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println("Error occured while clicking on web element : " + e.getMessage());
		}
	}
	
	public void sendkeys(WebElement element, String text) {
		try {
			element.sendKeys(text);
		}catch(Exception e) {
			System.out.println("Error occured while entering text on web element : " + e.getMessage());
		}
	}

}
