package facebookTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browser.PoJo;
import Utility.Utility;
import facebookPOM.Login;

public class TestingScript extends PoJo 
{
	Utility utilize;
	Login log;
	WebDriver driver;
	
	
	@BeforeClass
	public void Beforeclass()
	{
		driver=ChromeBrowser();

	}
	
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		 utilize= new Utility();
		log= new Login(driver);
		
		log.UID(utilize.data(2, 0));
		log.PWD(utilize.data(2, 1));
		log.LogIn();
		String Expected = driver.getCurrentUrl();
		String Actual="https://www.facebook.com/ganesh.alane";
		utilize.ScreenShot(driver);
		Assert.assertEquals(Actual, Expected, "Facebook Login failed");
		
	}
	

}
