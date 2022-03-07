package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		String verifyTitle = driver.getTitle();
		String verifyUrl = driver.getCurrentUrl();
		
       if(verifyTitle.equalsIgnoreCase("actitime - login"))
			
		{
			System.out.println("Title is present");
		}
		else
		{
			System.out.println("Title is not present");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		
		driver.findElement(By.name("remember")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		if(verifyUrl.contains("demo.actitime.com"))
		{
			System.out.println("URL is correct");
		}
		else
		{
			System.out.println("URL is not present");
		}
		
	}

}
