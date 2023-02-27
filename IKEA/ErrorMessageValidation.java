package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ErrorMessageValidation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		
		Username.sendKeys("Admin");
		
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Login.click();
		
		String ExpectedText = "Required";
		
		String errormsg = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getText();
		
		System.out.println(errormsg);
		
		if(ExpectedText.equalsIgnoreCase(errormsg)) {
			
			System.out.println("The text matches and the error message is right");
		}else {
			
			System.out.println("The text does not matche and the error message is wrong");
		}
			
			
		
	}

}
