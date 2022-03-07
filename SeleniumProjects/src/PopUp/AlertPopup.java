package PopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	   
	    
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	 
	    driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
	    driver.findElement(By.id("popup_menu_item_2")).click();


	    driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	    driver.findElement(By.id("name")).sendKeys("Soumya");
	    driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
	    
	    Alert a = driver.switchTo().alert();
	    a.dismiss();
	   
	    
	    Thread.sleep(3000);
	    driver.close();
	    
	
	 
	  
	    		

	}

}
