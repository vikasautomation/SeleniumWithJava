import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Product type:
		driver.findElement(By.xpath("(//div[@class=\"dropdown\"]//a[@class=\"btn-primary dropdown-toggle btn-block\"])[1]")).click();
		List<WebElement> allProducationtypeOptions = driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
		selectOptionsFromDropdown(allProducationtypeOptions, "Accounts");
		
		//Product:
		driver.findElement(By.xpath("(//div[@class=\"dropdown\"]//a[@class=\"btn-primary dropdown-toggle btn-block\"])[2]")).click();
		List<WebElement> allProducats = driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
		selectOptionsFromDropdown(allProducats, "Savings Accounts");
		driver.close();
	}
	
		public  static void selectOptionsFromDropdown(List<WebElement> options , String value) {
			for(WebElement option:options) {
				if(option.getText().equals(value))
				option.click();
			}
			
		}
		

}
