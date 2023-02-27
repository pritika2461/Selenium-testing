package Capgemini.IKEA;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TakescreenshotEx {

	public static void main(String[] args) throws IOException {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/tool-tips");
		
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenshot, new File("C:\\Users\\Harsha Patil\\Desktop\\Excelr\\Image.jpg"));
		
		
			}

}
