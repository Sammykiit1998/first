package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String verifyTitle = driver.getTitle();
		if(verifyTitle.equalsIgnoreCase("orangehrm"))
		{
			System.out.println("Title is present");
		}
		else
		{
			System.out.println("Title is not present");
		}
		
		String verifyUrl = driver.getCurrentUrl();
		if(verifyUrl.contains("orangehrmlive"))
		{
			System.out.println("Url is correct");
		}
		else
		{
			System.out.println("Url is not correct");
		}
		
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
