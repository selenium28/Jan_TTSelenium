package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		
		String url = "https://www.facebook.com/login/device-based/regular/login/";
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		// By Using ID
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("ABCD");
		
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("1234");
		
		// By using Name
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		// By using LinkText
		WebElement forgetLink = driver.findElement(By.linkText("Forgotten account?"));
		forgetLink.click();
		
		// By using PartialLinkText
		WebElement signUpFacebookLink = driver.findElement(By.partialLinkText("Sign up for"));
		signUpFacebookLink.click();
		
		// By using TagName
		WebElement signUpFacebookTag = driver.findElement(By.tagName("a"));
		signUpFacebookTag.click();
		
		// By using ClassName
		WebElement userNameClassName = driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt"));
		userNameClassName.sendKeys("12345");
		
		// By using xPath
		WebElement emailAddress = driver.findElement(By.xpath("//input[@placeholder = 'Email address or mobile number']"));
		emailAddress.sendKeys("123456");
		
	}

}
