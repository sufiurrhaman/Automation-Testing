package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {

	WebDriver driver;

	public Register(WebDriver driver) {

		this.driver = driver;
	}

	public void BaseURL() {

		driver.get("https://new.steadfast.com.bd/register");
	}

	public void Headline() {

		WebElement Headline = driver.findElement(By.xpath("//h3[@class='text-left text-color-13 font-h-md-23 font-regular']"));
		Headline.isDisplayed();
		System.out.println(Headline.getText());
	}

	public void NameOfBussiness() throws InterruptedException {

		WebElement NameOfBussiness = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[1]/div/input"));
		NameOfBussiness.click();
		NameOfBussiness.sendKeys("Sufiur.com");
		Thread.sleep(3000);

	}

	public void FirstName() throws InterruptedException {

		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[2]/div[1]/div/input"));
		FirstName.click();
		FirstName.sendKeys("Md.Sufiur");
		Thread.sleep(3000);
	}

	public void LastName() throws InterruptedException {

		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[2]/div[2]/div/input"));
		LastName.click();
		LastName.sendKeys("Rahman");
		Thread.sleep(3000);
	}

	public void Location() throws InterruptedException {

		WebElement Location = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[3]/div/textarea"));
		Location.click();
		Location.sendKeys("Jatrabari");
		Thread.sleep(3000);
	}

	public void Phone() throws InterruptedException {

		WebElement Phone = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[4]/div/input"));
		Phone.click();
		Phone.sendKeys("01836328818");
		Thread.sleep(3000);
	}

	public void Email() throws InterruptedException {

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[5]/div/input"));
		Email.click();
		Email.sendKeys("Sufiur.sefat@gmail.com");
		Thread.sleep(3000);
	}

	public void Password() throws InterruptedException {

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[6]/div/div[1]/div/input"));
		Password.click();
		Password.sendKeys("Abc@999");
		Thread.sleep(3000);
	}

	public void ConfirmPassword() throws InterruptedException {

		WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[6]/div/div[2]/div/input"));
		ConfirmPassword.click();
		ConfirmPassword.sendKeys("Abc@999");
		Thread.sleep(3000);
	}

	public void RegisterNow() throws InterruptedException {

		WebElement RegisterNow = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div[2]/div/div/form/div[7]/button"));
		RegisterNow.isDisplayed();
		System.out.println(RegisterNow.getText());
		RegisterNow.click();
		Thread.sleep(3000);
	}

}
