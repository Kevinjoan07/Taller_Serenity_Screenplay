package com.saucedemo.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_exitosa.feature",
        glue = "com.saucedemo.Stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CompraExitosa {
}
