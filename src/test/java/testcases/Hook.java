package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Page;

public class Hook extends Page
{
	   
	public void openBrowser(String b,String u)
	{
		super.openBrowser(b, u);
	}
	   
	public void xxx()
	{
		System.out.println("xx "+driver);
		//driver.quit();
		super.closeBrowser();
	}
		
	   // amazon
	@FindBy(xpath = xpath.AllXpath.signin)
	public static WebElement signin;
	
	@FindBy(xpath = xpath.AllXpath.uid)
	public static WebElement uid;
	
	@FindBy(xpath = xpath.AllXpath.cntbtn)
	public static WebElement cntbtn;
	
	@FindBy(xpath = xpath.AllXpath.pwd)
	public static WebElement pwd;
	
	@FindBy(xpath = xpath.AllXpath.err1)
	public static WebElement err1;
	
	@FindBy(xpath = xpath.AllXpath.submit)
	public static WebElement submit;
	
	@FindBy(xpath = xpath.AllXpath.err2)
	public static WebElement err2;
	
	   // facebook
	@FindBy(xpath = xpath.AllXpath.fuid)
	public static WebElement fuid;
	
	@FindBy(xpath = xpath.AllXpath.fpwd)
	public static WebElement fpwd;
	
	@FindBy(xpath = xpath.AllXpath.fbtn)
	public static WebElement fbtn;
	
}
