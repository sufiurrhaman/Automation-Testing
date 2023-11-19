package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pricing {

	WebDriver driver;

	public Pricing(WebDriver driver) {

		this.driver = driver;
	}

	public void BaseURL() {

		driver.get("https://new.steadfast.com.bd/#pricing");
	}

	public void From() throws InterruptedException {

		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"FromId\"]")));
		Thread.sleep(3000);
		dropdown.selectByVisibleText("Gazipur");
		// Thread.sleep(3000);
	}

	public void Destination() throws InterruptedException {

		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"destinationId\"]")));
		dropdown.selectByVisibleText("Cumilla");
		Thread.sleep(3000);
	}

	public void Catagory() throws InterruptedException {

		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"serviceId\"]")));
		dropdown.selectByVisibleText("Book");
		Thread.sleep(3000);
	}

	public void Service() throws InterruptedException {

		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"serviceId\"]")));
		dropdown.selectByVisibleText("Regular");
		Thread.sleep(3000);
	}
	
	public void Weight() throws InterruptedException {
		
		WebElement Weight = driver.findElement(By.xpath("//*[@id=\"weightId\"]"));
		Weight.click();
		Weight.clear();
		Weight.sendKeys("5");
		Thread.sleep(3000);
	}
	
	public void Total() {
		WebElement Total = driver.findElement(By.xpath("//*[@id=\"pricing\"]/div/div/div[2]/div[2]/div/div/div/strong"));
		Total.isDisplayed();
		System.out.println(Total.getText());
		
	}

}
