package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/HooksDemo/HooksDemot7.feature", glue = "StepsForHooks",
                    monochrome = true,
                    plugin = {"pretty","html:target/cucmber-reports.html"})
public class TestRunnerForHookst7 {
}
