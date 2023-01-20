package ExelR.EcapProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	        WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/alerts");
			
			WebElement simplealert = driver.findElement(By.xpath("//button[@id='alertButton']"));
			simplealert.click();
	
			Alert alt = driver.switchTo().alert();
			alt.accept();
			
			Thread.sleep(1000);

			
			WebElement confirmalert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
			confirmalert.click();
			
			Alert alt1 = driver.switchTo().alert();
			alt1.dismiss();
			
			Thread.sleep(1000);

			
			WebElement promtalert = driver.findElement(By.xpath("//button[@id='promtButton']"));
			promtalert.click();
			
			Alert alt2 = driver.switchTo().alert();
			
			Thread.sleep(1000);
			
			alt2.sendKeys("Pritika");

}
}