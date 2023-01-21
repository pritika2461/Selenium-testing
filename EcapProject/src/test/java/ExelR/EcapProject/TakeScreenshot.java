package ExelR.EcapProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/tool-tips");
		
		File ss = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(ss, new File("D:\\Pritika S\\ExelR\\image.jpg"));

	}

}
