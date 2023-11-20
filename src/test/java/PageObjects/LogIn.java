package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	WebDriver driver;

	public LogIn(WebDriver driver) {

		this.driver = driver;
	}
    
	//Get URL
	public void BaseUrl() {

		driver.get("https://new.steadfast.com.bd/login");
	}
    
	//Print page headline
	public void Headline() {

		WebElement Headline = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/div/h3"));
		Headline.isDisplayed();
		System.out.println(Headline.getText());
	}
     
	//Type Email
	public void Email() throws InterruptedException {

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[1]/input"));
		Email.click();
		Email.sendKeys("Sufiur.sefat@gmail.com");
		Thread.sleep(3000);
	}
    
	//Type Password
	public void Password() throws InterruptedException {

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[2]/input"));
		Password.click();
		Password.sendKeys("Abc@999");
		Thread.sleep(3000);
	}
    
	//Submit Button
	public void LogInButton() throws InterruptedException {

		WebElement LogInButton= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[4]/button"));
		LogInButton.isDisplayed();
		System.out.println(LogInButton.getText());
		LogInButton.click();
		Thread.sleep(3000);
	}

}
