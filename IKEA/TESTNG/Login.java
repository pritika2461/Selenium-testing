import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login
{
  WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

  }
  @Test 
  public void f() 
  {
	 WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	 uname.sendKeys("Admin");
	 
	 WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	 pass.sendKeys("admin123");
	 
	 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	 login.click();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
