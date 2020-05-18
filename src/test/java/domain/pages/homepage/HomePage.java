package domain.pages.homepage;

public class HomePage {

	private HomePageActController act;
	private HomePageVerifyController verify;
	
	private HomePage(HomePageActController act, HomePageVerifyController verify) {
		this.act = act;
		this.verify = verify;
	}
	
	public HomePageActController act() {
		return act;
	}
	
	public HomePageVerifyController verify() {
		return verify;
	}
	
	public static HomePage getHomePage() {
		return new HomePage(new HomePageActController(), new HomePageVerifyController());
	}
}

	
