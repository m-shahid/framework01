package tests;

import org.testng.annotations.Test;

import core.BaseTest;
import domain.pages.BasePage;;

public class SampleTest extends BaseTest{

	@Test
	public void searchTest() {

		BasePage.getHomePage()
				.act()
				.enterSearchText("selenium")
				.clickOnSearchButton();
		
		BasePage.getSearchPage()
				.verify()
				.pageTitleShouldContains("selenium");

	}
}
