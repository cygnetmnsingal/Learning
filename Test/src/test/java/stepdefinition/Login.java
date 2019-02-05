package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.spi.Elements;

import cucumber.api.java.en.Given;
import test.Login_test;

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
