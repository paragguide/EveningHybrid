package testcases;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPwdTest 
{
	public boolean flag = true;
	
	@Given("userid is correct")
	public void userid_is_correct() 
	{
	    if(AmazonUidTest.b == true)
	    {
	    	flag = true;
	    }
	    else
	    {
	    	flag = false;
	    }
	}
	@When("i enter password {string}")
	public void i_enter_password(String p) 
	{
	    if(flag == true)
	    {
	    	Hook.pwd.sendKeys(p);
	    }
	    else
	    {
	    	Assert.fail();
	    }
	}
	@When("click submit button")
	public void click_submit_button() 
	{
	    Hook.submit.click();
	}
	@Then("I should login")
	public void i_should_login() 
	{
		try {
	  String m =  Hook.err2.getText();
	  System.out.println(m);
	  Assert.fail();
	  flag = false;
		}
		catch(Exception e)
		{
			flag = true;
		}
	  
	}
	@Then("should not get error")
	public void should_not_get_error() 
	{
	    if(flag == true)
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	Assert.fail();
	    }
	}

}
