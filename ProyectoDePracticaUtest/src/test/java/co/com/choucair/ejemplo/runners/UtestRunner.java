package co.com.choucair.ejemplo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utest_practica.feature",
        glue = "co.com.choucair.ejemplo.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags =   "@Utest",
        dryRun = false
)
public class UtestRunner {
}
