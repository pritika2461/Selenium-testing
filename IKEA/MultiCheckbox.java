package Capgemini.IKEA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class MultiCheckbox {

    public static void main(String[] args) throws InterruptedException {


    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsha Patil\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// this will invoke the chrome browser with the URL
		
		// driver.get(URL)
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
		
		driver.switchTo().frame(frame);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		// This  will scroll down the page by  1000 pixel vertical	
		
        js.executeScript("window.scrollBy(0 , 600)", "");

        List<WebElement> Checkboxs = driver.findElements(By.xpath("//span[@class = 'ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));

        int size = Checkboxs.size();

        for (int i = 1; i<size ; i++){
        	
        	
        	Checkboxs.get(i).click();
          

       
        }
    }

    
    
}
