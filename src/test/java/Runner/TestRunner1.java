package Runner;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	    features = "src/test/resources/BaseClass",   // your .feature file path
	    glue = "Steps",                             // your step definition package
	    tags = "@smoke",                            // optional
	    plugin = {"pretty", "html:target/cucumber-report.html"}
	)
	public class TestRunner1 extends AbstractTestNGCucumberTests {
	}

