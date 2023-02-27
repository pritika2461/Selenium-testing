package Capgemini.IKEA.TESTNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations
{
	
	// testcase 1
	WebDriver driver;
	
	@Test
	
	public void testcase1() 
	{
		 uname.sendKeys("Admin");
		 
		 WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 pass.sendKeys("admin123");
		 
		 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		 login.click();
		  
	}
	
	// testcase 2
	
		@Test
		
		public void testcase2() {
			
			System.out.println("In testcase 2");
			
	}
		
		// Before method
		
		@BeforeMethod
		public void beforeMethod() {
			
			WebDriverManager.chromedriver().setup();
			driver = new  ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
				}
		
		// After method
		
		@AfterMethod
		
		public void afterMethod() {
			
			driver.close();
		}
		
		
}
