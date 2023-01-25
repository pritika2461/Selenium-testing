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
    	  driver.get("https://www.orangehrm.com/contact-sales/");
    	  
    	  WebElement demp = driver.findElement(By.id("Form_getForm_Country"));
    	  Select dropdownemp = new Select(demp);
    	  
    	  dropdownemp.selectByIndex(1);
    	  
    	  //dropdownemp.selectByValue("Andorra");
    	  
    	  //dropdownemp.selectByVisibleText("Andorra");
      }
}
