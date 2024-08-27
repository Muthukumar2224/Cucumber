package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/java/features/addtoCart.feature"},
		//dryRun = true, //checks mapped or not
		snippets = SnippetType.CAMELCASE, //Step definition without underscore(_)
		monochrome = true,//remove junk in console
	//	glue={"steps","hooks"},
		glue = {"steps","hooks","pages"},
		
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//		plugin = {"pretty","html:reports","json:reports/result.json",
//				"junit:reports/result.xml"}
		//tags= {"@reg"}
		)
public class CartTestRunner extends AbstractTestNGCucumberTests {

}
