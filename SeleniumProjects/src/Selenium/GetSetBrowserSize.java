package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowserSize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com");
		System.out.println(driver.manage().window().getSize()); //1050, 670
		
		Dimension d = new Dimension(600,200);  
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize()); //600,200		
		
		//driver.quit();
		// TODO Auto-generated method stub

	}

}
