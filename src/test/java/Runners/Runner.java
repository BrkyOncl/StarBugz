package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumberreports",
        features = "src/test/resourses/features",
        glue = "steps",
        tags = "@EventsSmoke",
        dryRun = false
)
public class Runner {

}
