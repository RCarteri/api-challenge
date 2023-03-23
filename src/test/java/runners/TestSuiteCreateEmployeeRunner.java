package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "classpath:features",
        glue="stepsDefinitions",
        plugin= {"pretty", "html:reports/myreport.html", "json:reports/myreport.json"}
)

public class TestSuiteCreateEmployeeRunner {
}
