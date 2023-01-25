package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripExample {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.chromeDriver.setup();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		//WebElement login = driver.findElement(By.className("makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut"));
		//login.click();
		
		//WebElement login1 = driver.findElement(By.className("appendBottom2 font14 latoBold blackText cursorPointer"));
		//login1.click();
		
		driver.findElement(By.id("chNavIcon appendBottom2 chSprite chTrains")).click();
		
		
		
	}

}
