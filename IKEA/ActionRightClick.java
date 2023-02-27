package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightClick {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://automationexercise.com/");
		
		WebElement Home = driver.findElement(By.linkText("Home"));
		
		Actions act = new Actions(driver);	
		
		act.contextClick(Home).build().perform();
		
		WebElement contact = driver.findElement(By.linkText("Contact us"));
		
		act.doubleClick(contact).build().perform();
}
	
}
