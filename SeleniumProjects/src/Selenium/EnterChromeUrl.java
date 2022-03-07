package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterChromeUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.google.com");
		driver.get("https://www.ozonesignature.com");
		
		// TODO Auto-generated method stub

	}

}
