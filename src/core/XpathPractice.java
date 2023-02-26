package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/login/device-based/regular/login/";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// DOM --> Document Object Model
		
		// Simple xPath
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		userName.sendKeys("1223");
		
		// css Selector
		WebElement userName2 = driver.findElement(By.cssSelector("input[name='email']"));
		userName2.sendKeys("234");
		
		// Text xPath
		WebElement pIMText = driver.findElement(By.xpath("//*[text()='PIM']"));
		pIMText.click();
		
		// Contains xPath
		WebElement addEmp = driver.findElement(By.xpath("//*[contains(text(),'Add Employee')]"));
		addEmp.click();
		
		// Following xPath
		WebElement subUnitDropdown = driver.findElement(By.xpath("//*[text()='Sub Unit']//following::div[4]"));
		subUnitDropdown.click();
		
		// Preceding xPath
		WebElement assignLeave = driver.findElement(By.xpath("//*[text()='Assign Leave']//preceding::button[1]"));
		assignLeave.click();
		
		// FOllowing xPath
		WebElement assignLeave2 = driver.findElement(By.xpath("//*[text()='Quick Launch']//following::div[3]/button"));
		assignLeave2.click();
		

	}

}
