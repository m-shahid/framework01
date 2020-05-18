package domain.pages;

import domain.pages.homepage.HomePage;
import domain.pages.searchpage.SearchPage;

public class BasePage {

	public static HomePage getHomePage() {
		return HomePage.getHomePage();
	}
	
	public static SearchPage getSearchPage() {
		return SearchPage.getSearchPage();
	}
}
