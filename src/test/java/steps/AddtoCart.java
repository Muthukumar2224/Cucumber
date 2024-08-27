//package steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import drivers.DriverInstance;
//
//public class AddtoCart extends DriverInstance {
////WebDriver driver;
////WebDriverWait wait;
//	
//	
////	@Given("User should navigate to the application")
////	public void userShouldNavigateToTheApplication() {
////		// Write code here that turns the phrase above into concrete actions
////		  driver = new ChromeDriver();
////		  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
////		  driver.get("https://bookcart.azurewebsites.net/");
////		  driver.manage().window().maximize();
////		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
////	}
//
//	@Given("User should login as {string} and {string}")
//	public void userShouldLoginAsAnd(String username, String password) {
//		// Write code here that turns the phrase above into concrete actions
//		 driver.findElement(By.xpath("//span[normalize-space()=\"Login\"]")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//		 driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button/span[2]")).click();
//	     try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Given("User search a {string}")
//	public void userSearchA(String book) {
//	 driver.findElement(By.xpath("//input[@placeholder='Search books or authors']")).sendKeys(book);
//	  WebElement searchoptions =  driver.findElement(By.xpath("//mat-option[@class='mat-mdc-option mdc-list-item ng-star-inserted'][1]"));
//			  //driver.findElement(By.cssSelector("span.mat-option-text"));
//	  WebElement options = wait.until(ExpectedConditions.visibilityOf(searchoptions));
//		options.click();
//	}
//
//	@When("User add the book to the cart")
//	public void userAddTheBookToTheCart() {
//		// Write code here that turns the phrase above into concrete actions
//		WebElement addtoCart = driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']"));
//		wait.until(ExpectedConditions.visibilityOf(addtoCart)).click();	
//	
//	}
//
//	@Then("the cart badge should be updated")
//	public void theCartBadgeShouldBeUpdated() throws InterruptedException {
//		
////		WebElement snackbar = driver.findElement(By.tagName("snack-bar-container")); 
////		wait.until(ExpectedConditions.visibilityOf(snackbar));
////		wait.until(ExpectedConditions.invisibilityOf(snackbar));
//		Thread.sleep(2000);
//		String text = driver.findElement(By.xpath("//span[@id='mat-badge-content-0']")).getText();	
//		System.out.println("No of books in cart "+text);	
//		Assert.assertEquals((Integer.parseInt(text))>0,true);
//	//	driver.quit();
//	}
//}
