package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {

	public static void main(String[] args) 
	{
		//WebDriverManager.chromeDriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status :"+searchstore.isDisplayed());
		System.out.println("Display Status :"+searchstore.isEnabled());
		System.out.println("Display Status :"+searchstore.isSelected());

	}

}
