package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefresh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to("https://www.myntra.com");
		//driver.get("https://www.flipkart.com");
		//driver.get("https://www.myntra.com");

		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// TODO Auto-generated method stub

	}

}
