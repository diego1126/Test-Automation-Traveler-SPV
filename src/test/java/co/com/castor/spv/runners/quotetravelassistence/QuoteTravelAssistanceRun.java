package co.com.castor.spv.runners.quotetravelassistence;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/quotetravelassistance/quotetravelassistance.feature",
        glue ="co.com.castor.spv.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE)
public class QuoteTravelAssistanceRun {
}
