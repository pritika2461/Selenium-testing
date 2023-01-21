package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipEx {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/tool-tips");
		WebElement tooltipbutton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		String tooltiptext = tooltipbutton.getText();
		System.out.println(tooltiptext);
		
		if(tooltiptext.equalsIgnoreCase("You hovered over the mouse"))
		{
			System.out.println("Matches");
		}
		else 
		{
			System.out.println("Not match..");

		}
		
	
	}

}
