package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver webDriver;
 
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webDriver.chrome.driver", "chromedriver");

		webDriver = new ChromeDriver();
		webDriver.get("https://ui.freecrm.com/");
		System.out.println("I am in user_is_already_on_login_page");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = webDriver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRM", title);
		System.out.println("I am in title_of_login_page_is_free_CRM");
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		webDriver.findElement(By.name("email")).sendKeys(username);
		webDriver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = webDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String title = webDriver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRM", title);
	}
}
