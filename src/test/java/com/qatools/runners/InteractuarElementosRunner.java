package com.qatools.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/Features/tools_qa.feature",
        glue = "com.qatools.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class InteractuarElementosRunner {
}
