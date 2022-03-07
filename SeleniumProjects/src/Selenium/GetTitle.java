package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		//String title = driver.getTitle();
		//System.out.println(title);
		
		System.out.println(driver.getTitle());     //code optimisation
		
		
		driver.quit();
		// TODO Auto-generated method stub

	}

}
