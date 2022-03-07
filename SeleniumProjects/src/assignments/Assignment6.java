package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(actualUrl);
		
		if(actualTitle.equals("OrangeHRM"))
		{
			System.out.println("PASS: HOMEPAGE IS DISPLAYED");
		}
		else
		{
			System.out.println("FAIL: HOMEPAGE IS NOT DISPLAYED");
		}
		
		// TODO Auto-generated method stub

	}

}
