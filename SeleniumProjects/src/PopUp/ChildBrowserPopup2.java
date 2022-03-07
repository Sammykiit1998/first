package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChildBrowserPopup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		    driver.get("https://www.google.co.in/");
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		      
		      String parent = driver.getWindowHandle();
		   Set<String> child = driver.getWindowHandles();
		 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.amazon.in/");
	 
  WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
      
	    dropdown.click();
	       Select s = new Select(dropdown);
	         s.selectByVisibleText("Apps & Games");
	           Thread.sleep(3000);
	             driver.findElement(By.id("nav-search-submit-button")).click();
	               Thread.sleep(3000);
	                 
	                    driver.close();
           
	              driver.switchTo().window(parent);
	            Thread.sleep(3000);
	          driver.findElement(By.name("q")).sendKeys("Seleni");
	        driver.findElement(By.xpath("(//li[@role='presentation'])[4]")).click();
	      driver.findElement(By.xpath("//h3[text()='Selenium Webdriver Tutorial with Examples | BrowserStack']")).click();
	    driver.navigate().back();
	  driver.close();
	         
		

	}

}
