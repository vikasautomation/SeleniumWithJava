package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsClassAndTagName {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		// class name
		int sliders = driver.findElements(By.className("homeslider-container")).size();
		System.out.println("Total sliders "+sliders);
		
		//tag name 
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println("Total links "+links);

	}

}
