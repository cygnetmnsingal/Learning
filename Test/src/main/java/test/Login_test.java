package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import locators.Locators;

public class Login_test 
{
	WebDriver driver = new ChromeDriver();
	
	Locators webTest = PageFactory.initElements(driver,Locators.class);
	
	public void openPage()
	{
		driver.get("https://cygnet.hrinnova.com/");
	}
	
	public void loginTest(String Username,String Password)
	{
		webTest.name.sendKeys(Username);
		webTest.pass.sendKeys(Password);
		webTest.Login.click();
		driver.quit();
	}
}
