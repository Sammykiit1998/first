package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.intl=us");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.findElement(By.cssSelector("a[role='button']")).click();
		driver.findElement(By.cssSelector("input[autocomplete='given-name']")).sendKeys("Soumya");
		driver.findElement(By.cssSelector("input[autocomplete='family-name']")).sendKeys("Rout");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[type='button']")).click();
		
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(actualUrl);
		
		if(actualTitle.equalsIgnoreCase("Yahoo"))
		{
			System.out.println("PASS : HOMEPAGE IS DISPLAYED");
		}
		else
		{
			System.out.println("FAIL : HOMEPAGE IS NOT DISPLAYED");
		}
		
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
