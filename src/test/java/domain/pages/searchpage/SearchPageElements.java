package domain.pages.searchpage;

import org.openqa.selenium.By;

import domain.pages.homepage.HomePageElements;

public class SearchPageElements {

	private static SearchPageElements searchPageElements;
	
	private SearchPageElements() {
		//prevent other classes to use constructor
	}
	
	public static SearchPageElements getSearchPageElements() {
		if(searchPageElements == null) {
			searchPageElements = new SearchPageElements();
		}
		return searchPageElements;
	}
}
