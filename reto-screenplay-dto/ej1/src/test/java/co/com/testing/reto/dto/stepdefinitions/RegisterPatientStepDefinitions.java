package co.com.testing.reto.dto.stepdefinitions;

import co.com.testing.reto.dto.model.Patient;
import co.com.testing.reto.dto.questions.CreatedDoctor;
import co.com.testing.reto.dto.questions.CreatedPatient;
import co.com.testing.reto.dto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import java.util.Map;

import static co.com.testing.reto.dto.util.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterPatientStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("Alejandro needs to register a patient")
    public void carlosNeedsToRegisterWithANewDoctor() {
        System.out.println("hello given");
        OnStage.theActorCalled(ACTOR).wasAbleTo(OpenWeb.openWebPage(),
                SelectPatient.clickOnPatient()
        );
    }
    @When("He does register patient inside the Hospital page")
    public void heDoesRegisterPatientInsideTheHospitalPage(DataTable dataTable) {
        List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
        Patient patient1 = new Patient(map.get(0).get("patient-firstname"), map.get(0).get("patient-lastname"), map.get(0).get("patient-telephone"));
        theActorInTheSpotlight().attemptsTo(PutPatientInformation.putInformation(patient1));
    }


    @Then("Page shows to him that  Patient was registered successfully with the message (.*)")
    public void pageShowsToHimThatPatientWasRegisteredSuccessfullyWithTheMessage(String question) {
        theActorInTheSpotlight().should(seeThat(CreatedPatient.isShown()));
    }
}