package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	
	PageContext context;
	
	public LoginPage(PageContext context) {
	this.context = context;
	}
	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
	    // Write code here that turns the phrase above into concrete actions
		context.getDriver().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
	    // Write code here that turns the phrase above into concrete actions
		context.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}
	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
		context.getDriver().findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button/span[2]")).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("Login should fail")
	public void loginShouldFail() {
	    // Write code here that turns the phrase above into concrete actions
	String errmsg = context.getDriver().findElement(By.xpath("//*[@id='mat-mdc-error-0']")).getText();
	Assert.assertEquals(errmsg, "Username or Password is incorrect.");
	}
	@Given("User should login as {string} and {string}")
	public void userShouldLoginAsAnd(String username, String password) {
		this.userEnterTheUsernameAs(username);
		this.userEnterThePasswordAs(password);
		this.userClickOnTheLoginButton();
	}

}
