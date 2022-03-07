package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetPageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.myntra.com");
		System.out.println(driver.getPageSource());
		
		driver.quit();
		
		
		// TODO Auto-generated method stub

	}

}
