package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {
	
	WebDriver driver;
	
	public Contact(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void BaseURL() {
		
		driver.get("https://new.steadfast.com.bd/contact");
		
	}
	public void Headline() {
		
		WebElement Headline = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section[2]/div/div/div[1]/div/h2"));
		Headline.isDisplayed();
		System.out.println(Headline.getText());
	}
	 public void Email() throws InterruptedException {
		 WebElement Email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section[2]/div/div/div[1]/div/div/form/div[1]/input"));
		 Email.sendKeys("ABC@gmail.com");
		 Thread.sleep(3000);
	 }
	 public void Message() throws InterruptedException {
		 
		 WebElement Message = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section[2]/div/div/div[1]/div/div/form/div[2]/textarea"));
		 Message.sendKeys("Hello SteadFast");
		 Thread.sleep(3000);
	 }

}
