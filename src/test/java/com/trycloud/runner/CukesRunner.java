package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/trycloud/step_definitions",
        dryRun = false,
        tags = "",
        publish = false
)


public class CukesRunner {
}
