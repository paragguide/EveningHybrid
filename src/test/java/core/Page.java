package core;



import java.sql.Connection; // jdbc library
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class Page 
{
	 public WebDriver driver = null; // global variable
	 
	public void openBrowser(String browser,String url)   // define
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
	//	driver.get(url); // not prefer cannot go back / forward / refresh
	
		     // or.....
		driver.navigate().to(url); // prefer can go back / forward / refrerh
		
		PageFactory.initElements(driver, this); // for @FindBy
				
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.manage().window().maximize(); // full screen of laptop
	}
	
	public void closeBrowser()
	{
		System.out.println("yy"+driver);
		driver.quit();
	}
	
	
	}
