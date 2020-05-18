package tests;

import static domain.pages.homepage.HomePage.getHomePage;
import static domain.pages.searchpage.SearchPage.getSearchPage;

import org.testng.annotations.Test;

import domain.pages.homepage.HomePage;
import domain.pages.searchpage.SearchPage;;

public class SampleTest extends BaseTest{

	HomePage homePage = getHomePage();
	SearchPage searchPage = getSearchPage();

	@Test
	public void searchTest() {

		homePage.act()
				.enterSearchText("selenium")
				.clickOnSearchButton();
		
		searchPage.verify()
					.pageTitleShouldContains("selenium");

	}
}
