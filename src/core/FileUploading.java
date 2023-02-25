package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
	
	WebDriver driver;

	public static void main(String[] args) {

		FileUploading objFileUploading = new FileUploading();
		objFileUploading.browserLaunch();
		objFileUploading.fileUpload();

	}

	public void browserLaunch() {
		String url = "https://demo.guru99.com/test/upload/";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public void fileUpload() {
		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\Hp\\Desktop\\Demo.txt");

		WebElement checkBox = driver.findElement(By.id("terms"));
		checkBox.click();

		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitButton.click();

		WebElement successMsg = driver.findElement(By.xpath("//*[text()='has been successfully uploaded.']"));
		successMsg.isDisplayed();
		System.out.println("SuccessFull Message" +successMsg);
	}

}
