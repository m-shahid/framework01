package domain.pages.searchpage;

import controller.BaseController;

public class SearchPageVerifyController extends BaseController{

	public SearchPageVerifyController(SearchPageElements elements) {
		// TODO Auto-generated constructor stub
	}

	public SearchPageVerifyController pageTitleShouldContains(String searchText) {
		verifyController.pageTitleShouldContains(searchText);
		return this;
	}
}
