//package steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import drivers.DriverInstance;
//
//public class LoginSteps extends DriverInstance {
////    WebDriver driver;
////    WebDriverWait wait;
//			// TODO Auto-generated method stub
//		
//		@Given("User clicks on the login link")
//		public void userClicksOnTheLoginButton() {
//		    // Write code here that turns the phrase above into concrete actions
//		   driver.findElement(By.xpath("//span[normalize-space()=\"Login\"]")).click();
//		}
//		@Given("User enter the username as {string}")
//		public void userEnterTheUsernameAs(String username) {
//		    // Write code here that turns the phrase above into concrete actions
//			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//		}
//
//		@Given("User enter the password as {string}")
//		public void userEnterThePasswordAs(String password) {
//		    // Write code here that turns the phrase above into concrete actions
//			 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//		}
//		@When("User click on the login button")
//		public void userClickOnTheLoginButton() {
//		    // Write code here that turns the phrase above into concrete actions
//		    driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button/span[2]")).click();
//		}
//
//		@Then("Login should be success")
//		public void loginShouldBeSuccess() {
//		    // Write code here that turns the phrase above into concrete actions
//		    
//		}
//		@When("Login should fail")
//		public void loginShouldFail() {
//		    // Write code here that turns the phrase above into concrete actions
//		String errmsg = driver.findElement(By.xpath("//*[@id='mat-mdc-error-0']")).getText();
//		Assert.assertEquals(errmsg, "Username or Password is incorrect.");
//		}
//
//	}
//
