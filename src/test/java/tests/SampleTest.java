package tests;

import org.testng.annotations.Test;

import core.BaseTest;
import domain.pages.BasePage;
import helper.TestDataProvider;;

public class SampleTest extends BaseTest{

	@Test(dataProvider="GoogleSearchData", dataProviderClass=TestDataProvider.class)
	public void searchTest(String searchText) {

		BasePage.getHomePage()
				.act()
				.enterSearchText(searchText)
				.clickOnSearchButton();
		
		BasePage.getSearchPage()
				.verify()
				.pageTitleShouldContains(searchText);

	}
}
