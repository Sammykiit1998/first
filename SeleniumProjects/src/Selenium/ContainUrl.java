package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ContainUrl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String actualUrl = driver.getTitle();
		if(actualUrl.contains("Google"))
		{
			System.out.println("URL is present");
		}
		else
		{
			System.out.println("URL is not present");
		}
		
		driver.quit();
		// TODO Auto-generated method stub

	}

}
