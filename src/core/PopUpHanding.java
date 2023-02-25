package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHanding {

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/delete_customer.php";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		// Switch to alert pop
		// Alert is a interface in Selenium
		Alert alert = driver.switchTo().alert();
		String deleteMsg = alert.getText();
		System.out.println(deleteMsg);
		
		alert.accept();
		

	}

}
