package ExelR.EcapProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcmd 
{ 
    public static void main(String[] args) throws InterruptedException
    {
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.orangehrm.com/");
    	
    	driver.manage().window().maximize();
    	
    	// Navigate back
    	driver.navigate().back();
    	
    	// Navigate forword..
    	driver.navigate().forward();
    	
    	driver.navigate().refresh();
    	
    	driver.navigate().to("https://www.google.com");
    	
    	String eTitle ="Orenge HRM";
    	
    	String aTitle = driver.getTitle();
    	
    	// equals 
    	if(eTitle.equals(aTitle))
    	{
    		System.out.print("Title Match....");
    	}
    	else
    	{
    		System.out.print("Title Not Match");
    	}
    Thread.sleep(2000);
    }
}
