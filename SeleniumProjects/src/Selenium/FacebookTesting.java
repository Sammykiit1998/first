package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("7008280550");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Soumya@1998");
		Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        
		
		
		
		// TODO Auto-generated method stub

	}

}
