package Capgemini.IKEA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		// this will invoke the Edge browser with the URL
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(500);
		

	}

}
