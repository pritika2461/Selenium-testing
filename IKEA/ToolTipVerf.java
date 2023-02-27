package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipVerf {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement tooltipbutton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		// get the title attribute of the value
		
		String tooltiptext = tooltipbutton.getAttribute("title");
		
		System.out.println(tooltiptext);
		
		if(tooltiptext.equals(tooltiptext)) {
			
			System.out.println("Tool tip matches");
		} else {
			
			System.out.println("Tool tip do not match");
		}
		
	

	}

}

