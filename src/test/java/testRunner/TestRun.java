package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = { ".//features/login.feature" },
    glue = "stepsDefinitions",
    monochrome = true,
    plugin = {"pretty"}
)
public class TestRun {

}
