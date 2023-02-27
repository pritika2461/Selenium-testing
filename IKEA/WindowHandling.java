package Capgemini.IKEA;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
					
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://demoqa.com/browser-windows");
	
	// fetch the window handle of the parent window
	
	String parent = driver.getWindowHandle();
	
	System.out.println(parent);
	
	WebElement tab = driver.findElement(By.xpath("//button[@id='tabButton']"));
	
	tab.click();
	
	Set<String> s = driver.getWindowHandles();
	
	// now iterate using the iterator
	
	Iterator<String> I1 = s.iterator();
	
	while(I1.hasNext()) {
		
		String childWindow = I1.next();
		
		if(!parent.equalsIgnoreCase(childWindow)) {
			
			driver.switchTo().window(childWindow);
			
			Thread.sleep(2000);
			
		String textinchildwindow = 	driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		
		System.out.println(textinchildwindow);
		
		driver.close();
				
			
		}
	}
	// switch to the parent window
	
	driver.switchTo().window(parent);
	
					
		

	}

}
