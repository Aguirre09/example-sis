package co.com.testing.reto.dto.tasks;

import co.com.testing.reto.dto.userinterface.IndexPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPatient implements Task {


    @Override
    public < T extends Actor> void performAs(T theActor){
            theActor.attemptsTo(
                    Click.on(IndexPage.BUTTON_PATIENT_INDEX)
            );
    }
    // va a retornar un performable
    public static SelectPatient clickOnPatient(){

        // retorna la clase, "agarrar las variables"
        // invoca el constructor en background, evita la creacion con "new"
        return instrumented(SelectPatient.class);
    }
}
