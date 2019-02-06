package stepdefinition;


import cucumber.api.java.en.Given;
import pages.Login_test;

public class Login extends Login_test
{

	//WebDriver driver = new ChromeDriver();
	@Given("^user is on page of Hr Portal$")
	public void user_is_on_page()
	{
		openPage();
	}
	
	@Given("^login$")
	public void login()
	{
		loginTest("mnsingal","Jan_2019");
	}
	
}
