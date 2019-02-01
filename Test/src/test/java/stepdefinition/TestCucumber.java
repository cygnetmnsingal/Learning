package stepdefinition;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;

public class TestCucumber 
{	
	@BeforeTest
	public void before(Scenario scenario)
	{
		System.out.println("Starting : "+scenario.getName());
	}
	@Given("^user is on page$")
	public void user_is_on_page()
	{
		Reporter.log("First Cucumber Test");
		System.out.println("Test Done");	System.out.println("Test Done");	System.out.println("Test Done");
	}

}
