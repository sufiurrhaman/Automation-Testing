package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
	
	WebDriver driver;
	HomePage homepage;
	
	@BeforeSuite
	public void StartBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		homepage = new HomePage(driver);

	}
	@Test
	public void verifyHomePage() {
		
		homepage.BaseURL();
		homepage.Logo();
		homepage.Unit1();
		homepage.Unit2();
		homepage.Unit3();
		homepage.Unit4();
		homepage.Unit5();
		homepage.Unit6();
		homepage.Goal1();
		homepage.Goal2();
		homepage.Goal3();
		homepage.Goal4();
		homepage.Goal5();
		homepage.Goal6();
		homepage.OurService();
		homepage.ServiceTital1();
		homepage.ServiceTital2();
		homepage.ServiceTital3();
		homepage.ServiceTital4();
		homepage.ServiceAreaTital();
		homepage.CalculateChargeTital();
	}
	
	@AfterSuite
	public void CloseBrowser() {

		driver.quit();
	}


}
