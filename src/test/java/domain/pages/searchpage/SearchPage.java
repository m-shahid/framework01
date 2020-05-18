package domain.pages.searchpage;

public class SearchPage {

	private SearchPageActController act;
	private SearchPageVerifyController verify;
	
	private SearchPage(SearchPageActController act, SearchPageVerifyController verify) {
		this.act = act;
		this.verify = verify;
	}
	
	public SearchPageActController act() {
		return act;
	}
	
	public SearchPageVerifyController verify() {
		return verify;
	}
	
	public static SearchPage getSearchPage() {
		return new SearchPage(new SearchPageActController(), new SearchPageVerifyController());
	}
}
