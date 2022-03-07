package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("trainee");
		Thread.sleep(3000);

		driver.findElement(By.name("pwd")).sendKeys("trainee");
		Thread.sleep(3000);

		driver.findElement(By.name("remember")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);

		// TODO Auto-generated method stub

	}

}
