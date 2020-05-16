package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import core.Driver;

public class SampleTest extends Driver{
  
	
  @Test
  public void launchAndLoginTest() throws Exception {
	  String url = "http://www.google.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  
  @Test(dependsOnMethods = { "launchAndLoginTest" })
  public void searchTest() {
	  String searchText = "Selenium";
	  WebElement searchTextBox = driver.findElement(By.xpath("//*[@name='q']"));
	  searchTextBox.sendKeys(searchText);
	  
	  WebElement searchButton = driver.findElement(By.xpath("(//*[@name='btnK'])[2]"));
	  searchButton.click();
	  
	  assertTrue(driver.getTitle().contains(searchText));
  }
}
