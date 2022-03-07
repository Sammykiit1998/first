package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		String actualTitle=driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(actualUrl);
		
		if(actualTitle.equals("actiTIME - Login"))
		{
			System.out.println("PASS: HOMEPAGE IS DISPLAYED");
		}
		else
		{
			System.out.println("FAIL: HOMEPAGE IS NOT DISPLAYED");
		}
		
		if(actualUrl.contains("demo"))
		{
			System.out.println("PASS: URL IS DISPLAYED");
		}
		else
		{
			System.out.println("FAIL: URL IS NOT DISPLAYED");
		}
		// TODO Auto-generated method stub

	}

}
