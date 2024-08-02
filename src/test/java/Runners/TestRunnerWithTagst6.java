package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeaturesWithTags", glue = "StepDefinitions",
                    monochrome = true,
                    tags = "@smoke and @regression")
public class TestRunnerWithTagst6 {
}
