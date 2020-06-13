package com.br.treinamentoJenkins;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                dryRun = false,
                plugin = {"json:target/cucumber.json"},
        features = {"src/test/resource/"},
        glue = {"com/br/treinamentoJenkins/step"},
        tags = {"@yamanTest"}
		)

public class runTest {

}

