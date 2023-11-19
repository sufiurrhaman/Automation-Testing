package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.Contact;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactTest {

	WebDriver driver;
	Contact contact;

	@BeforeSuite
	public void StartBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		contact = new Contact(driver);
	}
	@Test
	public void verifyContact() throws InterruptedException {
		
		contact.BaseURL();
		contact.Headline();
		contact.Email();
		contact.Message();
	}
	

	@AfterSuite
	public void CloseBrowser() {

		driver.quit();
		
	}

}
