package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector(".inputtext[type=text]")).sendKeys("bhai.vikas@ymail.com");
		driver.findElement(By.cssSelector(".inputtext[type=password]")).sendKeys("1130962786");
		driver.findElement(By.cssSelector("button[name=login]")).click();

	}

}
