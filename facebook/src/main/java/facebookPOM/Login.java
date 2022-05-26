package facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;

	@FindBy(xpath="//input[@id='email']")
	private WebElement UID;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement PWD;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement LogIn;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement SignUp;
	
	@FindBy (xpath="(//a[@href='https://www.facebook.com/ganesh.alane'])[1]")
	private WebElement profile;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void UID(String username)
	{
		UID.sendKeys(username);
	}
	public void PWD(String pass)
	{
		PWD.sendKeys(pass);
	}
	public void LogIn()
	{
		LogIn.click();
		profile.click();
		
	}
	public void CreateAccunt()
	{
		SignUp.click();
	}
	
	
	
	
}
