package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeWindow {

	public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
		
		driver.switchTo().frame(frame);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		// This  will scroll down the page by  1000 pixel vertical	
		
        js.executeScript("window.scrollBy(0 , 600)", "");
        
        WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']"));
        
        Actions act = new Actions(driver);
        
      // act.dragAndDropBy(resize, 350, 375).build().perform();
        
      
		act.clickAndHold(resize).moveByOffset(200, 225).release().build().perform();
        
        


	}

}
