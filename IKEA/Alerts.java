package Capgemini.IKEA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		

		Thread.sleep(3000);
		WebElement simplealert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		simplealert.click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		

		Thread.sleep(3000);
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		
		confirmalert.click();
		
		Alert alt1 = driver.switchTo().alert();
		
		alt1.dismiss();
		

		Thread.sleep(3000);
		
		WebElement prmpalert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		prmpalert.click();
		
		Alert alt2 = driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		alt2.sendKeys("Harsha");
		
		
		
		
		
		
		
	
	}

}
