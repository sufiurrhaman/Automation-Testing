package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.Area;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AreaTest {

	WebDriver driver;
	Area area;

	@BeforeSuite
	public void StartBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		area = new Area(driver);
	}
    @Test
	public void verifyArea() throws InterruptedException {

		area.BaseURL();
		area.Districts();
		area.SubDistricts();
		area.Result();
		area.Search();
		area.SelectArea();
	}

	@AfterSuite
	public void CloseBrowser() {

		driver.quit();
		
	}

}
