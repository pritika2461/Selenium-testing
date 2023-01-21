package ExelR.EcapProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement frame = driver.findElement(By.xpath("//*[@id\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		//List<WebElement> checkboxes = driver.findElement(By.xpath("//span[@class='ui-checkbox']"));
		//int size = checkboxs.size();
		
		
		
	}

}
