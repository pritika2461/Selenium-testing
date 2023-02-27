package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// this will invoke the chrome browser with the URL
		
		driver.get("https://www.facebook.com/login/");
		
		// ID locator
		
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("hkhande@gmail.com");	
		
		// Tag name 
		
		WebElement Login = driver.findElement(By.tagName("Log in"));
		
		Login.click();
		
		// link text
		
		WebElement signup = driver.findElement(By.linkText("Sign up for Facebook"));
		
		signup.click();
		
		// partial link text
		
		WebElement forgot = driver.findElement(By.partialLinkText("Forgotten"));
		
		forgot.click();
		
		// css selector 
		
		WebElement loginbutton = driver.findElement(By.cssSelector("#loginbutton"));
		
		//loginbutton.click();
		
	}
		
		
	}


