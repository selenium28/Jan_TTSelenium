package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		
		WebElement username = driver.findElement(By.name("username")); 
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password")); 
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']")); 
		loginButton.click();
		System.out.println("Login successful");
		
	}
     
}


// https://demo.guru99.com/test/newtours/register.php
// https://demo.guru99.com/test/delete_customer.php
// 