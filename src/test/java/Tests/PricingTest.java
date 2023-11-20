package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.Pricing;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PricingTest {

	WebDriver driver;
	Pricing pricing;

	@BeforeSuite
	public void StartBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		pricing = new Pricing(driver);
	}
	@Test
	public void verifyPricing() throws InterruptedException {
		
		pricing.BaseURL();
		pricing.From();
		pricing.Destination();
		pricing.Category();
		pricing.Service();
		pricing.Weight();
		pricing.Total();
	}

	@AfterSuite
	public void CloseBrowser() {

		driver.quit();
	}
}
