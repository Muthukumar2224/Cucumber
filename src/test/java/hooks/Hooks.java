package hooks;

import java.time.Duration;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import drivers.DriverInstance;

public class Hooks extends DriverInstance {
//	@BeforeStep
//	public void beforesteps(Scenario scenario)
//	{
//		//scenario.write("Started - Koushik");
//		byte[] screenshotas = driver.getScreenshotAs(OutputType.BYTES);
//		scenario.embed(screenshotas,"image/png");
//	}
//	@AfterStep
//	public void aftersteps(Scenario scenario) {
//		// scenario.write("finished - Koushik");
//	}
	PageContext context;
	public Hooks(PageContext context) {
		this.context = context;
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		RemoteWebDriver driver = new ChromeDriver();
		context.setDriver(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		context.setWait(wait);
		context.getDriver().get("https://bookcart.azurewebsites.net/");
		context.getDriver().manage().window().maximize();
		context.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		String name = scenario.getName();
		// System.out.println("Scenario name: "+name);

//	  System.out.println(scenario.getId());
//	  System.out.println(scenario.getLines());
//	  System.out.println(scenario.getUri());
//	  System.out.println(scenario.getSourceTagNames());

		Type status = scenario.getStatus();
		System.out.println("result " + status);

	}

	@After("@cleanUp")
	public void cleanData(Scenario scenario) {
		System.out.println("Running cleanup");
		scenario.write("Before cleaning the cart");
		byte[] screenshotas = context.getDriver().getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotas, "image/png");
		
		context.getDriver().findElement(By.xpath(
				"//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-button-touch-target']"))
				.click();
		context.getDriver().findElement(By.xpath("//div[@class='ng-star-inserted']//button[1]")).click();
		String text = context.getDriver().findElement(By.xpath("//mat-card-title[normalize-space()='Your shopping cart is empty.']"))
				.getText();
		Assert.assertEquals(text, "Your shopping cart is empty.");
		scenario.write("After cleaning the cart");
		screenshotas = context.getDriver().getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotas, "image/png");

	}
	/*
	 * @After(order=2) public void afterScenario1(Scenario scenario) { boolean
	 * failed = scenario.isFailed(); System.out.println("Is failed: "+failed);
	 * if(failed) { byte[] screenshotas = driver.getScreenshotAs(OutputType.BYTES);
	 * scenario.embed(screenshotas,"image/png"); } driver.quit(); }
	 */

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		System.out.println("Running tear down");
		boolean failed = scenario.isFailed();
		System.out.println("Is failed: " + failed);
		if (failed) {
			byte[] screenshotas = driver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotas, "image/png");
		}

		Collection<String> sourceTagNames = scenario.getSourceTagNames();
		boolean contains = sourceTagNames.contains("@cleanup");
		if (contains) {

		}
		context.getDriver().quit();

		Type status = scenario.getStatus();
		System.out.println("result " + status);

	}
}
