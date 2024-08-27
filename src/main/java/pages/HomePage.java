package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageContext;
import cucumber.api.java.en.When;

public class HomePage {
	PageContext context;

	public HomePage(PageContext context) {
		this.context = context;
	}

	@When("User add the book to the cart")
	public void userAddTheBookToTheCart() {
		// Write code here that turns the phrase above into concrete actions
		WebElement addtoCart = context.getDriver().findElement(By.xpath("//span[normalize-space()='Add to Cart']"));
		context.getWait().until(ExpectedConditions.visibilityOf(addtoCart)).click();

	}
}
