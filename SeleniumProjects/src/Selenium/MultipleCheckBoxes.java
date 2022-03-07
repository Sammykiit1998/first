package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkboxes.size());
		driver.close();
		// TODO Auto-generated method stub

	}

}
