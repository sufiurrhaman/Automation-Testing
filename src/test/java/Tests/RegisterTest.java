package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import PageObjects.HomePage;
import PageObjects.Register;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest {

	WebDriver driver;
	Register register;

	@BeforeSuite
	public void StartBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		register= new Register(driver);

	}
	
	@Test
	public void verifyRegisterTest() throws InterruptedException {
		
		register.BaseURL();
		register.Headline();
		register.NameOfBussiness();
		register.FirstName();
		register.LastName();
		register.Location();
		register.Phone();
		register.Email();
		register.Password();
		register.ConfirmPassword();
		register.RegisterNow();
		
	}

	@AfterSuite
	public void CloseBrowser() {

		driver.quit();
	}

}
