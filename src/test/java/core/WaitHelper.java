package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static core.DriverFactory.getDriver;

public class WaitHelper {
	
	private static WaitHelper waitHelper;	
	private WebDriverWait wait;
	private WebDriver driver;
	
	
	private WaitHelper() {
		driver = getDriver();
		wait = new WebDriverWait(driver, 30);
	}
	
	public static WaitHelper getWaitHelper() {
		if(waitHelper == null) {
			waitHelper = new WaitHelper();
		}
		return waitHelper;
	}
	
	public void waitTillElementTeBeClickable(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(Exception e) {
			System.out.println("Error occured while wait : " + e.getMessage());
		}
	}
	
	public void waitTillElementIsVisible(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e) {
			System.out.println("Error occured while wait : " + e.getMessage());
		}
	}
	
	public void waitTillElementIsVisible(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}catch(Exception e) {
			System.out.println("Error occured while wait : " + e.getMessage());
		}
	}
	
	public void waitTillPageTitleContains(String text) {
		try {
			wait.until(ExpectedConditions.titleContains(text));
		}catch(Exception e) {
			System.out.println("Error occured while wait : " + e.getMessage());
		}
	}
}
