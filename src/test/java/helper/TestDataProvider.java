package helper;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name="GoogleSearchData")
	public static Object[][] getGoogleSearchData(){
		return new Object[][] {
			{ "Selenium" },
			{ "WebDriver" },
			{ "TestNG" }
		}; 
	}
}
