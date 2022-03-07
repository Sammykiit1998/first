package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(actualTitle.equalsIgnoreCase("actiTIME - Login"))
		{
			System.out.println("PASS:HOMEPAGE IS DISPLAYED");
		}
		else
		{
			System.out.println("FAIL:HOMEPAGE IS NOT DISPLAYED");
		}
		
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
