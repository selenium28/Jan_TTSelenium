package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/newtours/register.php";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select selectCountry = new Select(countryDropdown);
		
		// By using index
//		selectCountry.selectByIndex(13);
		
		// By using Value
//		selectCountry.selectByValue("BRAZIL");
		
		// By using VisibleText
		selectCountry.selectByVisibleText("INDIA");

	}

}
