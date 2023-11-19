package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.LogIn;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTest {
	
	WebDriver driver;
	LogIn login;
	
	
	@BeforeSuite
	public void StartBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	    login = new LogIn(driver);
		
	}
	@Test
	public void verifyLogIn() throws InterruptedException {
		
		login.BaseUrl();
		login.Headline();
		login.Email();
		login.Password();
		login.LogInButton();
	}

	@AfterSuite
	public void CloseBrowser() {

		driver.quit();
	}

}
