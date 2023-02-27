package Capgemini.IKEA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalComamnds {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate To command
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		// navigate back
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		// navigate forward
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		// refresh
		
		driver.navigate().refresh();
		
		

	}

}
