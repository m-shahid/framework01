package domain.pages.searchpage;

import controller.BaseController;

public class SearchPageVerifyController extends BaseController{

	public SearchPageVerifyController pageTitleShouldContains(String searchText) {
		verifyController.pageTitleShouldContains(searchText);
		return this;
	}
}
