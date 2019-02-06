package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigFileReader;
import enums.DriverType;

public class WebDriverManager
{
	static WebDriver driver;

	static ConfigFileReader cong = new ConfigFileReader();
	

	public static WebDriver createDriver()
	{		
		String browserName = cong.properties.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) 
			driver = new ChromeDriver();
		else if(browserName.equals("firefox"))
			driver = new FirefoxDriver();
		return driver;
		
		
	}
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
