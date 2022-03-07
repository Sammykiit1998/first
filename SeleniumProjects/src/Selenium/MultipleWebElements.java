package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		//driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("7008280550");
		
		List<WebElement> links=driver.findElements(By.xpath("//div"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		// TODO Auto-generated method stub

	}

}
