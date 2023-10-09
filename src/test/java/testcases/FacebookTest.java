package testcases;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookTest 
{
	 Hook h = null;
	
	@Given("i open {string} and open url {string}")
	public void i_open_and_open_url(String browser, String url) 
	{
	    h = new Hook();
	    h.openBrowser(browser, url);
		
		
	}
	@When("^i enter userid (.*) and password (.*)")
	public void i_enter_userid_and_password(String i,String p) 
	{
	    Hook.fuid.sendKeys(i);
	    Hook.fpwd.sendKeys(p);
	}
	@When("submit form")
	public void submit_form() 
	{
	    Hook.fbtn.click();
	}
	@Then("check status")
	public void check_status() 
	{
	    System.out.println("pass");
	   h.xxx();
	   
	}



}
