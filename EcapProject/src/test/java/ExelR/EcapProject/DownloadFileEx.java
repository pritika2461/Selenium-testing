package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileEx {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
		
		WebElement  uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");
		
		WebElement  pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("admin123");
		
		driver.findElement(By.id("loginbtn")).click();
		
		
		
		
		
		//download.sendKeys(args);
		
		//Thread.sleep(1000);
	}

}
