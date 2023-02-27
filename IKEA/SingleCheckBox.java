package Capgemini.IKEA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleCheckBox {

	public static void main(String[] args) throws InterruptedException {
	

		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
			WebDriver driver = new FirefoxDriver();
		
			driver.get("https://jqueryui.com/checkboxradio/");
			driver.manage().window().maximize();
			WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			driver.switchTo().frame(frame);
			

			JavascriptExecutor js = (JavascriptExecutor) driver;  
			
			// This  will scroll down the page by  1000 pixel vertical	
			
	        js.executeScript("window.scrollBy(0 , 600)", "");

			driver.findElement(By.xpath("(//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[4]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		
		
		
	}


