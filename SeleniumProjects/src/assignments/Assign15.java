package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p[.='FLAT ₹400 OFF']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SIGN UP NOW >']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("7008280550");
		Thread.sleep(3000);
		driver.close();

	}

}
