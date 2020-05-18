package domain.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controller.BaseController;

public class HomePageActController extends BaseController {

	public HomePageActController enterSearchText(String searchText) {
		WebElement searchTextBox = driver.findElement(By.xpath("//*[@name='q']"));
		//searchTextBox.sendKeys(searchText);
		actController.sendkeys(searchTextBox, searchText);
		return this;
	}
	
	public void clickOnSearchButton() {
		 WebElement searchButton = driver.findElement(By.xpath("(//*[@name='btnK'])[2]"));
		 //searchButton.click();
		 actController.click(searchButton);
	}
	  
}
