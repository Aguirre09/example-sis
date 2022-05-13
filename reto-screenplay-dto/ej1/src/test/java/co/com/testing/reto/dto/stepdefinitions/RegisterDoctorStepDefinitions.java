package co.com.testing.reto.dto.stepdefinitions;

import co.com.testing.reto.dto.model.Doctor;
import co.com.testing.reto.dto.questions.CreatedDoctor;
import co.com.testing.reto.dto.tasks.OpenWeb;
import co.com.testing.reto.dto.tasks.PutDoctorInformation;
import co.com.testing.reto.dto.tasks.SelectDoctor;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

import static co.com.testing.reto.dto.userinterface.AddDoctorPage.SELECTOR_INFORMATION;
import static co.com.testing.reto.dto.util.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterDoctorStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Managed(driver = "chrome")
    WebDriver webDriver;

    @Given("Alejandro needs to register with a new doctor")
    public void carlosNeedsToRegisterWithANewDoctor() {
        System.out.println("hello given");
        OnStage.theActorCalled(ACTOR).wasAbleTo(OpenWeb.openWebPage(),
                SelectDoctor.clickOnDoctorPage()
        );
    }

    @When("He does register process inside the Hospital page")
    public void heDoesRegisterProcessInsideTheHospitalPage(DataTable dataTable) {
        System.out.println("hello when");
        List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);

        Doctor doctor = new Doctor(map.get(0).get(FIRST_NAME_ITEM), map.get(0).get(LAST_NAME_ITEM), map.get(0).get(TELEPHONE_ITEM));
       // Doctor doctor2 = new Doctor(map.get(1).get(FIRST_NAME_ITEM), map.get(1).get(LAST_NAME_ITEM), map.get(1).get(TELEPHONE_ITEM), map.get(1).get(ID_ITEM));

        //String doctores = map.get(0).get(FIRST_NAME_ITEM);
        // String apellido = map.get(0).get(LAST_NAME_ITEM);
        // System.out.println("el objeto es :"+ doctores);
        //System.out.println("apellido es :" + apellido);





        theActorInTheSpotlight().attemptsTo(PutDoctorInformation.putInformation(doctor));
        // otro paso, va al index
        //luego ingresa el segundo doctor
     //   theActorInTheSpotlight().attemptsTo(PutDoctorInformation.putInformation(doctor2));
    }
    @Then("Page shows him that Doctor is registered with the message (.*)")
    public void pageShowsHimThatHisMedicalAppointmentIsRegistered(String question) {
        System.out.println("hello then");
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Created.created(question)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreatedDoctor.created(), Matchers.is(true)));
    }
}