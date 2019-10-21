package com.maven.planit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", dryRun = false, strict = true, tags = "@sendMessage,@ProductSelectionAndRemoval",
        //plugin = {"json:src/test/yourlogo.json", "html:src/test/reports/cucumberReport.html"})
      plugin = {"json:target/Haritha.json"})

public class RunnerClass {
}
