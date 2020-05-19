package domain.pages.homepage;

import static domain.pages.homepage.HomePageElements.*;
import org.openqa.selenium.WebElement;
import controller.BaseController;

public class HomePageActController extends BaseController {

	private HomePageElements element;
	
	public HomePageActController(HomePageElements element) {
		this.element = element;
	}
	
	public HomePageActController enterSearchText(String searchText) {
		WebElement searchTextBox = actController.findElement(element.getSearchTextBox());
		actController.sendkeys(searchTextBox, searchText);
		return this;
	}
	
	public void clickOnSearchButton() {
		 WebElement searchButton = actController.findElement(element.getSearchButton());
		 actController.click(searchButton);
	}
	  
}
