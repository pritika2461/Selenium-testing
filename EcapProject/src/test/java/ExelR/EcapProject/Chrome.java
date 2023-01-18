package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome 
{
   public static void main(String[] args) throws InterruptedException
   {
	   WebDriver driver = new ChromeDriver();
	   // maximamize cmd
	   driver.manage().window().maximize();
	   
	   // browser commands
	   // driver.get()
	   driver.get("https://www.orangehrm.com/");
	   
	   //driver.getTitle()
	   String title  = driver.getTitle();
	   System.out.print(title);
	   
	   //driver.pageSource()
	   String pagesrc = driver.getPageSource();
	   System.out.println(pagesrc);
	   
	   //driver.getURL()
	   String url = driver.getCurrentUrl();
	   System.out.println(url);
	   
	   
	   //driver.close()
	   
	   //driver.close();
	   //driver.quit();
	   
	   driver.findElement(By.name("email"));
	   Thread.sleep(5000);
   }
}
