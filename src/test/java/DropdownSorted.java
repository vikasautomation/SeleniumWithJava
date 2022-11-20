import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Product type:
		driver.findElement(By.xpath("(//div[@class=\"dropdown\"]//a[@class=\"btn-primary dropdown-toggle btn-block\"])[1]")).click();
		List<WebElement> allProducationtypeOptions = driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
		List originalList = new ArrayList();
		List tempList = new ArrayList();
		for(WebElement e: allProducationtypeOptions) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before Performing Sorting operation");
		System.out.println("Here we have Original list"+originalList);
		System.out.println("Here we have temp list"+tempList);
		Collections.sort(tempList);
		
		System.out.println("After sorting the temporary list "+tempList);
		
		if(tempList==originalList) {
			System.out.println("Dropdownis sorted");
			
		}
		else {
			System.out.println("Dropdown is not sorted");

		}
		driver.close();
	}
	

}
