package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import locators.Locators;

public class Login_test 
{
	WebDriver driver = new ChromeDriver();
	
	Locators webTest = PageFactory.initElements(driver,Locators.class);
	ConfigFileReader cong = new ConfigFileReader();
	public void openPage()
	{
		driver.get("https://cygnet.hrinnova.com/");
		String t = cong.properties.getProperty("test");
		System.out.println(t);
	}
	
	public void loginTest(String Username,String Password)
	{
		webTest.name.sendKeys(Username);
		webTest.pass.sendKeys(Password);
		webTest.Login.click();
		driver.close();
	}
}
