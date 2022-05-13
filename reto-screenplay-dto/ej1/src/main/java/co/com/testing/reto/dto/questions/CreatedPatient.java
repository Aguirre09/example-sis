package co.com.testing.reto.dto.questions;

import co.com.testing.reto.dto.userinterface.AddPatientPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Message about creation Patient information succesfully ")
public class CreatedPatient implements Question<Boolean> {



    public Boolean answeredBy(Actor actor){
        System.out.println("el dato es : "+AddPatientPage.DASHBOARD_SUCCESFULLY.resolveFor(actor).isVisible() );
        return AddPatientPage.DASHBOARD_SUCCESFULLY.resolveFor(actor).isVisible();
    }



    public static Question<Boolean> isShown(){
        return new CreatedPatient();
    }

}
