package co.com.todo1.certification.appgyfpersonas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features.front/autorizaciones_iniciales_exitoso.feature",
        snippets = SnippetType.CAMELCASE,
        glue="co.com.todo1.certification.appgyfpersonas.stepdefinitions",
         dryRun = false)

public class AutorizacionesInicialesExitoso {

}
