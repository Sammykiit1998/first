package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equalsIgnoreCase("google"))
		{
			System.out.println("Title is present");
			
		}
		else
		{
			System.out.println("Title is not present");
		}
		// TODO Auto-generated method stub

	}

}
