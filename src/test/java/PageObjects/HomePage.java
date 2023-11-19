package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public void BaseURL() {

		driver.get("https://new.steadfast.com.bd/");
	}

	public void Logo() {

		WebElement Logo = driver.findElement(By.xpath("//img[@alt='Steadfastcourier']"));
		Logo.isDisplayed();
		System.out.println(Logo.getText());
	}

	public void Unit1() {

		WebElement Unit1 = driver.findElement(By.xpath("//a[@id='gotoservices']"));
		Unit1.isDisplayed();
		System.out.println(Unit1.getText());

	}

	public void Unit2() {

		WebElement Unit2 = driver.findElement(By.xpath("//a[@id='gotoservicearea']"));
		Unit2.isDisplayed();
		System.out.println(Unit2.getText());
	}

	public void Unit3() {

		WebElement Unit3 = driver.findElement(By.xpath("//a[@id='gotopricing']"));
		Unit3.isDisplayed();
		System.out.println(Unit3.getText());
	}

	public void Unit4() {

		WebElement Unit4 = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[4]/a"));
		Unit4.isDisplayed();
		System.out.println(Unit4.getText());
	}

	public void Unit5() {

		WebElement Unit5 = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[5]/a"));
		Unit5.isDisplayed();
		System.out.println(Unit5.getText());
	}

	public void Unit6() {

		WebElement Unit6 = driver.findElement(
				By.xpath("//a[@class='nav-link font-sm-14 text-white btn bg-color-lightseagreen py-1 px-4']"));
		Unit6.isDisplayed();
		System.out.println(Unit6.getText());
	}

	public void Goal1() {

		WebElement Goal1 = driver.findElement(By.xpath(
				"//span[@class='pl-2 font-18 font-h-md-16 font-medium'][normalize-space()='Daily Pick up, No limitations']"));
		Goal1.isDisplayed();
		System.out.println(Goal1.getText());
	}

	public void Goal2() {

		WebElement Goal2 = driver.findElement(By
				.xpath("//span[@class='pl-2 font-18 font-h-md-16 font-medium'][normalize-space()='Cash on Delivery']"));
		Goal2.isDisplayed();
		System.out.println(Goal2.getText());
	}

	public void Goal3() {

		WebElement Goal3 = driver.findElement(By.xpath(
				"//span[@class='pl-2 font-18 font-h-md-16 font-medium'][normalize-space()='Faster Payment Service']"));
		Goal3.isDisplayed();
		System.out.println(Goal3.getText());
	}

	public void Goal4() {

		WebElement Goal4 = driver.findElement(By.xpath("//span[normalize-space()='Online Management']"));
		Goal4.isDisplayed();
		System.out.println(Goal4.getText());
	}

	public void Goal5() {

		WebElement Goal5 = driver.findElement(By.xpath("//span[normalize-space()='Real-Time Tracking']"));
		Goal5.isDisplayed();
		System.out.println(Goal5.getText());
	}

	public void Goal6() {

		WebElement Goal6 = driver.findElement(By.xpath(
				"//span[@class='pl-2 font-18 font-h-md-16 font-medium'][normalize-space()='Advanced Customer Service']"));
		Goal6.isDisplayed();
		System.out.println(Goal6.getText());
	}
    // Title print
	public void OurService() {

		WebElement OurService = driver.findElement(By.xpath("//h2[@class='heading-title text-center mb-0']"));
		OurService.isDisplayed();
		System.out.println(OurService.getText());
	}
	public void ServiceTital1() {

		WebElement ServiceTital1 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='E-commerce Delivery']"));
		ServiceTital1.isDisplayed();
		System.out.println(ServiceTital1.getText());
	}
	public void ServiceTital2() {

		WebElement ServiceTital2 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='Pick and Drop']"));
		ServiceTital2.isDisplayed();
		System.out.println(ServiceTital2.getText());
	}
	public void ServiceTital3() {

		WebElement ServiceTital3 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='Warehousing']"));
		ServiceTital3.isDisplayed();
		System.out.println(ServiceTital3.getText());
	}
	public void ServiceTital4() {

		WebElement ServiceTital4 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='Packaging']"));
		ServiceTital4.isDisplayed();
		System.out.println(ServiceTital4.getText());
	}
	public void ServiceAreaTital() {

		WebElement ServiceAreaTital = driver.findElement(By.xpath("//*[@id=\"service-area\"]/div/div/div[1]/h2"));
		ServiceAreaTital.isDisplayed();
		System.out.println(ServiceAreaTital.getText());
	}
	public void CalculateChargeTital() {

		WebElement CalculateChargeTital = driver.findElement(By.xpath("//*[@id=\"pricing\"]/div/div/div[1]/h2"));
		CalculateChargeTital.isDisplayed();
		System.out.println(CalculateChargeTital.getText());
	}
}
