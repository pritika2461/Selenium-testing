package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions act = new Actions(driver);	
		
		Action seriesofaction = act.moveToElement(Email).click().keyDown(Email, Keys.SHIFT).sendKeys(Email, "hello").build();
		
		seriesofaction.perform();

	}

}
