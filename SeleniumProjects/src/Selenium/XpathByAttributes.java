package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("7008280550");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Soumya@06");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// TODO Auto-generated method stub

	}

}
