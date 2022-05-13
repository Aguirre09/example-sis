package co.com.testing.reto.dto.tasks;

import co.com.testing.reto.dto.model.Doctor;
import co.com.testing.reto.dto.model.Patient;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.testing.reto.dto.userinterface.AddDoctorPage.*;
import static co.com.testing.reto.dto.userinterface.AddPatientPage.*;
import static co.com.testing.reto.dto.util.Constants.LINK_WEB_PAGE;
import static co.com.testing.reto.dto.util.Constants.VALUE_3;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutPatientInformation implements Task {
    private Patient patient;

    public PutPatientInformation(Patient patient) {
        this.patient = patient;
    }


    @Override
    public <T extends Actor> void performAs(T theActor){
        System.out.println("BANDERA !! ");
        String namePatient = patient.getNamePatient();
        System.out.println("el nombre del  paciente es : "+ namePatient);

        String lastnamePatient = patient.getLastnamePatient();
        System.out.println("el nombre del doctor es : "+ lastnamePatient);

        String telephonePatient = patient.getTelephonePatient();
        System.out.println("el telefono es : "+ telephonePatient);

        double num = Math.random()*100;

        String iD=String.valueOf(num);

        theActor.attemptsTo(
                Enter.theValue(namePatient).into(ADD_PATIENT_NAME),
                Enter.theValue(lastnamePatient).into(ADD_PATIENT_LASTNAME),
                Enter.theValue(telephonePatient).into(ADD_PATIENT_TELEPHONE),
                SelectFromOptions.byValue(VALUE_3).from(SELECTOR_INFORMATION_PATIENT),
                Enter.theValue(iD).into(ADD_PATIENT_ID),
                Click.on(PREPAID_PAGE_PATIENT),
                Click.on(BUTTON_SAVE_FINISH)
        );
    }

    public static PutPatientInformation putInformation(Patient patient){
        return instrumented (PutPatientInformation.class,patient);
    }
}