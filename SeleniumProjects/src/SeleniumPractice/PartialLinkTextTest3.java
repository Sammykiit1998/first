package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextTest3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement d = driver.findElement(By.partialLinkText("password?"));
		Thread.sleep(3000);
		
		d.click();
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("7008280550");
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
