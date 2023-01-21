package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick
{
	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationexercise.com/");
		
		WebElement home = driver.findElement(By.linkText("Home"));
		
		Actions act = new Actions(driver);
		act.contextClick(home).build().perform();
		
		WebElement contact = driver.findElement(By.linkText("Contact us"));
		act.doubleClick(contact).build().perform();
		
		
		

}
}
