package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//a[.='Forgot your password?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("7008280550");
		Thread.sleep(2000);
		driver.close();

	}

}
