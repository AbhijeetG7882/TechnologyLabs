package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	@Before(order=0)
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}

	@After(order=0)
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	@Before(order=1)
	public void setUP1(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}

	@After(order=1)
	public void tearDown1(){
		System.out.println("close the browser");
	}
	
	@Before("@First")
	public void beforeFirst(){
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst(){
		System.out.println("after only first sceanrio");
	}
	
	@Before("@Second")
	public void beforeSecond(){
		System.out.println("before only second scenario");
	}
}
