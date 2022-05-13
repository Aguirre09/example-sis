package co.com.testing.reto.dto.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/management_medical_agenda.feature",
        tags="@register",
        glue = "co.com.testing.reto.dto",
        snippets = SnippetType.CAMELCASE)

public class RegisterDoctorRunner {
}