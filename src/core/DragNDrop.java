package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	WebDriver driver;

	public static void main(String[] args) {
		DragNDrop objDragNDrop = new DragNDrop();
		objDragNDrop.browserLaunch();
		objDragNDrop.dragDrop();

	}
	
	public void browserLaunch() {
		String url = "https://jqueryui.com/droppable/";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void dragDrop() {
		
		driver.switchTo().frame(0);
		WebElement sourceFile = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destinationFile = driver.findElement(By.xpath("//div[@id='droppable']"));
	
		Actions action = new Actions(driver);
		action.clickAndHold(sourceFile).moveToElement(destinationFile).release().build().perform();
		System.out.println("sourceFile has dragged");
		
		
	}

}
