package domain.pages.searchpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static core.DriverFactory.getDriver;

public class SearchPageVerifyController {

	private WebDriver driver = getDriver();
	
	public SearchPageVerifyController pageTitleShouldContains(String searchText) {
		Assert.assertTrue(driver.getTitle().contains(searchText));
		return this;
	}
}
