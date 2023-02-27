package Capgemini.IKEA;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Downloadex {

	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\geckodriver.exe");
			
		WebDriver driver = new FirefoxDriver();
		// invoking the browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// to maximize the screen

		driver.manage().window().maximize();
		
		
		// locator ID

		WebElement Username = driver.findElement(By.id("txtUsername"));

		Username.sendKeys("Admin");

		// locator Name

		WebElement Password = driver.findElement(By.name("txtPassword"));

		Password.sendKeys("admin123");
		

		// locator xpath

		WebElement Submit = driver.findElement(By.xpath("//input[@id='btnLogin']"));

		Submit.click();
		
		Thread.sleep(2000);
		
		
		// click on recruitment 
		
		WebElement Recruitment = driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]"));
		
		Recruitment.click();
		
		Thread.sleep(2000);
		
		
		// click on candidates 
		
		WebElement candidates = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']"));
				
		candidates.click();
				
		Thread.sleep(2000);
	 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// donwward scroll
		
		js.executeScript("window.scrollBy(0, 1000)", "");
		
		Thread.sleep(2000);
		
		WebElement download = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]"));
		
		download.click();
		
		Thread.sleep(2000);
		
		
		String filename = "resume";
		
		boolean flag  = false ;
		
		String dirPath = "C:\\Users\\Harsha Patil\\Downloads";
		
		
		File dir = new File(dirPath);
		
		File[] files = dir.listFiles();
		
		if(files.length == 0 || files == null) {
			
			System.out.println("The directory is empty");
		}else {
			
			for (File listFile : files) {
				
				if (listFile.getName().contains(filename)) {
					
					System.out.println(filename);
					
				}
				
				flag = true;
				
				
				
			}
			}
			

	}

}
