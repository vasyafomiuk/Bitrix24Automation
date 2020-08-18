package com.bitrix24.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
<<<<<<< HEAD
        glue = "com/bitrix24/step_definitions",
//        tags = "@fileUploading",
        dryRun = false
=======
        glue = "com/bitrix24/step_definitions"
//        tags = "@fileUploading",
>>>>>>> b007029d5b837d9b6458e5eae38cda6f4ccb8dba
)
@RunWith(Cucumber.class)
public class TestRunner {
}
