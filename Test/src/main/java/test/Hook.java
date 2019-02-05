package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Hook 
{
	WebDriver driver = new ChromeDriver();
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
		System.out.println("Driver Close");
	}
}
