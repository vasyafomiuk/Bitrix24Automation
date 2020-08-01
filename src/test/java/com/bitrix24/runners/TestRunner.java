package com.bitrix24.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/bitrix24/step_definitions",
        tags = "@fileUploading",
        dryRun = true
)
@RunWith(Cucumber.class)
public class TestRunner {
}
