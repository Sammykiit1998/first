package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MaximizeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ICSA9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.myntra.com");
		 driver.manage().window().maximize();
		 driver.quit();
		// TODO Auto-generated method stub

	}

}
