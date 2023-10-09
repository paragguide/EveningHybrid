package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUidTest extends Page
{
	
	public static boolean b = true;
	
	@Given("i open {string} and enter url {string}")
	public void i_open_and_enter_url(String browser, String url) 
	{
	    
	    Hook h = new Hook();
		h.openBrowser(browser, url);
	}
	@When("I click signin")
	public void i_click_signin() 
	{
	    Hook.signin.click();
	}
	@When("enter userid {string}")
	public void enter_userid(String id) 
	{
	   Hook.uid.sendKeys(id);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
	    Hook.cntbtn.click();
	}
	@Then("password txtbox must come")
	public void password_txtbox_must_come() 
	{
	    if(Hook.pwd.isDisplayed())
	    {
	    	b = true;
	    }
	    else
	    {
	    	b = false;
	    }
	}
	@Then("error message should not come")
	public void error_message_should_not_come() 
	{  
		   try {
	  String m =  Hook.err1.getText();
	  System.out.println(m);
	  
	  b = false;
	  Assert.fail();
		   }
		   catch(Exception e)
		   {
			   b = true;
		   }
	}

}
