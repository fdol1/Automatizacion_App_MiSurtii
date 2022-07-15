package com.misurtii.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features/IniciarSesion.feature"},
        tags = {"@InicioDeSesion"},
        glue = {"com.misurtii.certificacion.stepsdefinitions"},
        snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerIniciarSesion {
}