package domain.pages.searchpage;

import static domain.pages.searchpage.SearchPageElements.getSearchPageElements;

public class SearchPage {

	private SearchPageElements elements;
	private SearchPageActController act;
	private SearchPageVerifyController verify;
	
	private SearchPage() {
		elements = getSearchPageElements();
		this.act = new SearchPageActController(elements);
		this.verify = new SearchPageVerifyController(elements);
	}

	public SearchPageActController act() {
		return act;
	}
	
	public SearchPageVerifyController verify() {
		return verify;
	}
	
	public static SearchPage getSearchPage() {
		return new SearchPage();
	}
}
