package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PoJo {

	WebDriver driver;
	public WebDriver ChromeBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://facebook.com/login");
		 driver.manage().window().maximize();
		 return driver;
	}
	public WebDriver FireFoxBrowser()
	{

		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		 driver= new FirefoxDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com");
		 driver.manage().window().maximize();
		 return driver;
	}
}
