package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		Actions action = new Actions(driver);
		//action.contextClick();

		WebElement src = driver.findElement(By.xpath("div[@id='draggable']"));		
		
		WebElement des = driver.findElement(By.xpath("div[@id='dropable']"));

		action.dragAndDrop(src, des);
	}

}
