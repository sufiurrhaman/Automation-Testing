package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Area {

	WebDriver driver;

	public Area(WebDriver driver) {

		this.driver = driver;

	}

	public void BaseURL() {

		driver.get("https://new.steadfast.com.bd/coverage-area");
	}

	public void Districts() throws InterruptedException {

		// select districts
		WebElement Districts = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div/div/div[2]/ul/li[13]"));
		Districts.click();
		Thread.sleep(3000);
	}

	public void SubDistricts() throws InterruptedException {

		// select Sub districts
		WebElement SubDistricts = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div/div/div[2]/ul/li[15]"));
		SubDistricts.click();
		Thread.sleep(3000);
	}
	//find result
	public void Result() {
		
		WebElement Result = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div/div/div[1]/div[1]/div/nav/ol"));
		Result.isDisplayed();
		System.out.println(Result.getText());
	}
	//search in search box
	public void Search() throws InterruptedException {
		
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div/div/div[1]/div[2]/div/div/form/div/input"));
		Search.sendKeys("Dhaka");
		Thread.sleep(3000);
	}
	
	public void SelectArea() throws InterruptedException {
		
		WebElement SelectArea = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/section/div/div/div/div/div/div[2]/table/tbody/tr[30]/td[1]"));
		SelectArea.isDisplayed();
		Thread.sleep(3000);
		SelectArea.click();
		System.out.println(SelectArea.getText());
	
	}
	

}
