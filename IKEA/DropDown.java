package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		// This  will scroll down the page by  1000 pixel vertical	
		
        js.executeScript("window.scrollBy(0 , 600)", "");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByValue("AUSTRIA");
		
		sel.selectByValue("ALGERIA");
		
		sel.selectByIndex(4);
		
		

	}

}
