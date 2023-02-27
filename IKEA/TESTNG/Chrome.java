package Capgemini.IKEA.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	
	
	@Test
	public void chrome() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// this will invoke the chrome browser with the URL
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(500);
		

	}

}
