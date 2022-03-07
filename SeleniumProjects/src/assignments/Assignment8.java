package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Men")).click();
		
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(actualUrl);
		
		driver.close();
		// TODO Auto-generated method stub

	}

}
