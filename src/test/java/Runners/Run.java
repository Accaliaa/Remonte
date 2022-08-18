package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@BACBPI-139",features="src/test/resources/features",glue = "Steps",
        plugin = { "pretty", "json:target/reports/cucumber.json"}
)
public class Run {

}
