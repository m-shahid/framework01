package domain.pages.homepage;

import org.openqa.selenium.By;

public class HomePageElements {

	private static HomePageElements homePageElements;
	
	private HomePageElements() {
		//prevent other classes to use constructor
	}
	
	private By searchTextBox = By.xpath("//*[@name='q']");
	private By searchButton = By.xpath("(//*[@name='btnK'])[1]");
	
	public By getSearchTextBox() {
		return searchTextBox;
	}
	
	public By getSearchButton() {
		return searchButton;
	}
	
	public static HomePageElements getHomePageElements() {
		if(homePageElements == null) {
			homePageElements = new HomePageElements();
		}
		return homePageElements;
	}

}
