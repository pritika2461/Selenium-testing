package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadEx {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement upload = driver.findElement(By.xpath("//input[@name='upload']"));
		
		upload.sendKeys("C:\\Users\\Harsha Patil\\Desktop\\Excelr\\NewBusiness.txt");
		
		Thread.sleep(500);
		
	}

}
