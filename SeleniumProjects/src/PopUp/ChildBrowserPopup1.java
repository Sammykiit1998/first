package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child= driver.getWindowHandles();
		
		
		for(String b : child ) {
			driver.switchTo().window(b);
		}
		
		
		driver.findElement(By.xpath("//a[text()='Try Free']")).click();
		driver.findElement(By.id("First Name")).sendKeys("Soumya");
		driver.findElement(By.id("Last Name")).sendKeys("rout");
		driver.findElement(By.id("Email")).sendKeys("sammy@gmail.com");
		driver.close();
		
		
		driver.switchTo().window(parent);
				
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		

	}

}
