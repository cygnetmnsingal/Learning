package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Locators 
{
	@FindBy (how =How.XPATH,using="//input[@placeholder='Username']")public WebElement name;
	@FindBy (how =How.XPATH,using="//input[@id='password']")public WebElement pass;
	@FindBy (how = How.XPATH,using="//button[@title='Login']")public WebElement Login;
}
