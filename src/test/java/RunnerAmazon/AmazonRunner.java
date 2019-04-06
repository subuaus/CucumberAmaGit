package RunnerAmazon;


	import org.junit.runner.RunWith;
	import cucumber.api.junit.Cucumber;
	import cucumber.api.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "C:\\Users\\User\\workspace\\AmazonCucumber\\src\\test\\java\\Features\\NavigateAmazon.feature",
		//features = "Features/NavigateAmazon.feature:3",
	 plugin={"pretty","html:target/cucumber-html-report",
			    "json:target/cucumber.json","junit:target/cucumber.xml",
			    "rerun:target/rerun.txt"},
			 glue={"StepDefinations"},
			 dryRun=false

			 
	 )


	public class AmazonRunner {

	}

