package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HeaderPage  {
	PageContext context;
	
	public HeaderPage(PageContext context) {
		this.context=context;
	}
	
	@Given("User clicks on the login link")
	public void userClicksOnTheLoginLink() {
	    // Write code here that turns the phrase above into concrete actions
	   context.getDriver().findElement(By.xpath("//span[normalize-space()=\"Login\"]")).click();
	}

	@Given("User search a {string}")
	public void userSearchA(String book) {
		context.getDriver().findElement(By.xpath("//input[@placeholder='Search books or authors']")).sendKeys(book);
	  WebElement searchoptions =  context.getDriver().findElement(By.xpath("//mat-option[@class='mat-mdc-option mdc-list-item ng-star-inserted'][1]"));
			  //driver.findElement(By.cssSelector("span.mat-option-text"));
	  WebElement options = context.getWait().until(ExpectedConditions.visibilityOf(searchoptions));
		options.click();
	}
	@Then("the cart badge should be updated")
	public void theCartBadgeShouldBeUpdated() throws InterruptedException {
		
//		WebElement snackbar = driver.findElement(By.tagName("snack-bar-container")); 
//		wait.until(ExpectedConditions.visibilityOf(snackbar));
//		wait.until(ExpectedConditions.invisibilityOf(snackbar));
		Thread.sleep(2000);
		String text = context.getDriver().findElement(By.xpath("//span[@id='mat-badge-content-0']")).getText();	
		System.out.println("No of books in cart "+text);	
		Assert.assertEquals((Integer.parseInt(text))>0,true);
	//	driver.quit();
	}
}
