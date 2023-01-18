package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		// find by class name
		//driver.findElement(By.className("M6CB1c rr4y5c")).click();
		
		// find by tagname
		driver.findElement(By.tagName("img")).click();
		
		//driver.findElement(By.cssSelector("input .btnK")).sendKeys("abc");
	}

}
