package Capgemini.IKEA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// this will invoke the chrome browser with the URL
		
		// driver.get(URL)
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// driver.getCurrentURL()
		
		String currenturl = driver.getCurrentUrl();
		
		
		System.out.println(currenturl);
		
		//driver.getTitle()
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// driver.getPageSource()
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		// driver.close - close the current window
		
		driver.close();
		
		// driver.quit()
		
	//	driver.quit();
		
		
		

	}

}
