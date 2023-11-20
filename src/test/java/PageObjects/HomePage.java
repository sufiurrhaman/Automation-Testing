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
    
	//Get URL
	public void BaseURL() {

		driver.get("https://new.steadfast.com.bd/");
	}
    
	//Logo of Website
	public void Logo() {

		WebElement Logo = driver.findElement(By.xpath("//img[@alt='Steadfastcourier']"));
		Logo.isDisplayed();
		System.out.println(Logo.getText());
	}
   
	//Services page
	public void Unit1() {

		WebElement Unit1 = driver.findElement(By.xpath("//a[@id='gotoservices']"));
		Unit1.isDisplayed();
		System.out.println(Unit1.getText());

	}
	
    //ServiceArea page
	public void Unit2() {

		WebElement Unit2 = driver.findElement(By.xpath("//a[@id='gotoservicearea']"));
		Unit2.isDisplayed();
		System.out.println(Unit2.getText());
	}
    
	//Pricing page
	public void Unit3() {

		WebElement Unit3 = driver.findElement(By.xpath("//a[@id='gotopricing']"));
		Unit3.isDisplayed();
		System.out.println(Unit3.getText());
	}
    
	//Contact page
	public void Unit4() {

		WebElement Unit4 = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[4]/a"));
		Unit4.isDisplayed();
		System.out.println(Unit4.getText());
	}
    //Register page
	public void Unit5() {

		WebElement Unit5 = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[5]/a"));
		Unit5.isDisplayed();
		System.out.println(Unit5.getText());
	}
    //Login page
	public void Unit6() {

		WebElement Unit6 = driver.findElement(
				By.xpath("//a[@class='nav-link font-sm-14 text-white btn bg-color-lightseagreen py-1 px-4']"));
		Unit6.isDisplayed();
		System.out.println(Unit6.getText());
	}
    
	//Services Goal1
	public void Goal1() {

		WebElement Goal1 = driver.findElement(By.xpath(
				"//span[@class='pl-2 font-18 font-h-md-16 font-medium'][normalize-space()='Daily Pick up, No limitations']"));
		Goal1.isDisplayed();
		System.out.println(Goal1.getText());
	}
    
	//Services Goal2
	public void Goal2() {

		WebElement Goal2 = driver.findElement(By
				.xpath("//span[@class='pl-2 font-18 font-h-md-16 font-medium'][normalize-space()='Cash on Delivery']"));
		Goal2.isDisplayed();
		System.out.println(Goal2.getText());
	}
    
	////Services Goal3
	public void Goal3() {

		WebElement Goal3 = driver.findElement(By.xpath(
				"//span[@class='pl-2 font-18 font-h-md-16 font-medium'][normalize-space()='Faster Payment Service']"));
		Goal3.isDisplayed();
		System.out.println(Goal3.getText());
	}
    
	////Services Goal4
	public void Goal4() {

		WebElement Goal4 = driver.findElement(By.xpath("//span[normalize-space()='Online Management']"));
		Goal4.isDisplayed();
		System.out.println(Goal4.getText());
	}
    
	////Services Goal5
	public void Goal5() {

		WebElement Goal5 = driver.findElement(By.xpath("//span[normalize-space()='Real-Time Tracking']"));
		Goal5.isDisplayed();
		System.out.println(Goal5.getText());
	}
   
	////Services Goal6
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
	
	//Service Title print1
	public void ServiceTitle1() {

		WebElement ServiceTitle1 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='E-commerce Delivery']"));
		ServiceTitle1.isDisplayed();
		System.out.println(ServiceTitle1.getText());
	}
	
	////Service Title print1
	public void ServiceTitle2() {

		WebElement ServiceTitle2 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='Pick and Drop']"));
		ServiceTitle2.isDisplayed();
		System.out.println(ServiceTitle2.getText());
	}
	
	////Service Title print3
	public void ServiceTitle3() {

		WebElement ServiceTitle3 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='Warehousing']"));
		ServiceTitle3.isDisplayed();
		System.out.println(ServiceTitle3.getText());
	}
	
	////Service Title print4
	public void ServiceTitle4() {

		WebElement ServiceTitle4 = driver.findElement(By.xpath("//p[@class='mb-0 font-18 text-center'][normalize-space()='Packaging']"));
		ServiceTitle4.isDisplayed();
		System.out.println(ServiceTitle4.getText());
	}
	
	//Print sservice area title
	public void ServiceAreaTitle() {

		WebElement ServiceAreaTitle = driver.findElement(By.xpath("//*[@id=\"service-area\"]/div/div/div[1]/h2"));
		ServiceAreaTitle.isDisplayed();
		System.out.println(ServiceAreaTitle.getText());
	}
	
	//print Calculate charge title
	public void CalculateChargeTitle() {

		WebElement CalculateChargeTitle = driver.findElement(By.xpath("//*[@id=\"pricing\"]/div/div/div[1]/h2"));
		CalculateChargeTitle.isDisplayed();
		System.out.println(CalculateChargeTitle.getText());
	}
}
