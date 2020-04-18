package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/steps_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = true,
        tags = "@sales_manager or @driver"
)
public class CucumberRunner {
}
