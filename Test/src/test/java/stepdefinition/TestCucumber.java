package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestCucumber 
{	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void before(Scenario scenario)
	{
		System.out.println("Starting : "+scenario.getName());
	}
	@Given("^user is on page$")
	public void user_is_on_page()
	{
		Reporter.log("First Cucumber Test");
		driver.get("https://www.google.com");
	}

	@Then("^Get the title$")
	public void get_the_title() 
	{
		System.out.println("Title is : "+driver.getTitle());
		driver.quit();
	}
	
	@Then("^Get the title and verify it$")
	public void verify() 
	{
		String title = driver.getTitle();
		
		if(title.equals("googlee"))
		{
			System.out.println("Matches");
		}
		else
		{
			System.out.println("Not Matches");
			
			Assert.assertTrue(false,"Not");
			
		}
		driver.quit();
	}
}
