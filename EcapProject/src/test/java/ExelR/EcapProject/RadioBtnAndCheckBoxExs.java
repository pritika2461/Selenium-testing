package ExelR.EcapProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndCheckBoxExs
{ 
	public static void main(String[] args)
	{
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		WebElement radiobtn = driver.findElement(By.id("radio-1"));
		radiobtn.click();
		
		WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
		checkbox2.click();
		}

}
