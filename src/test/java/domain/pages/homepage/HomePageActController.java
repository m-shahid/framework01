package domain.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static core.DriverFactory.getDriver;

public class HomePageActController {

	private WebDriver driver = getDriver();
	
	public HomePageActController enterSearchText(String searchText) {
		WebElement searchTextBox = driver.findElement(By.xpath("//*[@name='q']"));
		searchTextBox.sendKeys(searchText);
		return this;
	}
	
	public void clickOnSearchButton() {
		 WebElement searchButton = driver.findElement(By.xpath("(//*[@name='btnK'])[2]"));
		 searchButton.click();
	}
	  
}
