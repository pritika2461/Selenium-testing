package Capgemini.IKEA.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramterizedztests {
	
	
	@Test
	@Parameters("browser")
	public void parametertest(String browser) throws InterruptedException {
		
		if(browser.equals("chrome")) {
			
			System.out.println("Open chrome");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			// this will invoke the chrome browser with the URL
			
			driver.get("https://www.amazon.in/");
			
			Thread.sleep(500);
			
		}else if (browser.equals("firefox")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			// this will invoke the Firefox browser with the URL
			
			driver.get("https://www.amazon.in/");
			
			Thread.sleep(500);
			
		}
		
		
		
	}

}
