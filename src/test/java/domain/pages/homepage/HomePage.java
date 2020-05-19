package domain.pages.homepage;

import static domain.pages.homepage.HomePageElements.getHomePageElements;

public class HomePage {

	private HomePageElements homePageElements;
	private HomePageActController act;
	private HomePageVerifyController verify;

	
	private HomePage() {
		homePageElements = getHomePageElements();
		this.act = new HomePageActController(homePageElements);
		this.verify = new HomePageVerifyController(homePageElements);
	}
	
	public HomePageActController act() {
		return act;
	}
	
	public HomePageVerifyController verify() {
		return verify;
	}
	
	public static HomePage getHomePage() {
		return new HomePage();
	}
}

	
