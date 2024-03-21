package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions( 
	features=".//Feature/Customer.feature",	
	glue="StepDefinition",
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:target/cucumber-reports/reports22.html"}

	
		)
public class Run {
	
}
