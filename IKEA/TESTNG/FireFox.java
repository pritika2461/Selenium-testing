package Capgemini.IKEA.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {
	
	
	@Test
	public void firefox() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		// this will invoke the Firefox browser with the URL
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(500);
	}

}
