package ExelR.EcapProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsEx
{
      public static void main(String[] args)
      {
    	  WebDriver driver = new ChromeDriver();
    	  driver.get(null);
    	  
    	  WebElement demp = driver.findElement(By.id(""));
    	  Select dropdownemp = new Select(demp);
    	  
    	  dropdownemp.selectByIndex(11-20);
    	  
    	  //dropdownemp.selectByValue("");
    	  
    	  //dropdownemp.selectByVisibleText("");
      }
}
