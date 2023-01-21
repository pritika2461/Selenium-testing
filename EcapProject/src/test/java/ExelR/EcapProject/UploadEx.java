package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadEx {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-up-selenium-webdriver");
		WebElement upload = driver.findElement(By.xpath("//input[@type='file' and @name='upload']"));
		
		upload.sendKeys("D:\\Pritika S\\ExelR\\Doc\\PritikaDoc.pdf");
		
		Thread.sleep(1000);
	}

}
