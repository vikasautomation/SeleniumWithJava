package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsAllType {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		//By id and name 
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("Dress");
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirt");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	
		// By Partial link and link text
	//	driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText(" Chiffon Dress")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
