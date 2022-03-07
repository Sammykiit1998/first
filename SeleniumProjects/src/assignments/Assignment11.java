package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println(actualTitle);
		System.out.println(actualUrl);
		
		if(actualUrl.contains("orangehrmlive"))
		{
			System.out.println("PASS : URL IS CORRECT");
		}
		else
		{
			System.out.println("FAIL : URL IS NOT CORRECT");
		}
		
		
		driver.close();
		
	}

}
