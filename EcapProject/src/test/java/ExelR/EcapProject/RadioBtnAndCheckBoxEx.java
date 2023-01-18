package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndCheckBoxEx
{ 
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.className("btn btn-ohrm btn-free-demo")).click();
		
		//WebElement rbtn = driver.findElement(By.id("")).click();
		
	//	WebElement cbox = driver.findElement(By.id("")).click();

	}

}
