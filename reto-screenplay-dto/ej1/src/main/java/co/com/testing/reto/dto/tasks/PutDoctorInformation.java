package co.com.testing.reto.dto.tasks;

import co.com.testing.reto.dto.model.Doctor;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.testing.reto.dto.util.Constants.VALUE_3;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import static co.com.testing.reto.dto.userinterface.AddDoctorPage.*;

public class PutDoctorInformation implements Task {
    private Doctor doctor;

    public PutDoctorInformation(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public <T extends Actor> void performAs(T theActor){
        System.out.println("BANDERA !! ");
        String nameDoctor = doctor.getName();
        System.out.println("el nombre del doctor es : "+nameDoctor);

        String lastNameDoctor = doctor.getLastname();
        System.out.println("el nombre del doctor es : "+lastNameDoctor);

        String telephoneDoctor = doctor.getTelephone();
        System.out.println("el telefono es : "+ telephoneDoctor);

        String idDoctor = doctor.getId();
        System.out.println("el ID es : "+ idDoctor);

        double num = Math.random()*100;
        String s=String.valueOf(num);

        theActor.attemptsTo(
                Enter.theValue(nameDoctor).into(ADD_DOCTOR_NAME),
                // Enter.theValue().into(ADD_DOCTOR_NAME),

                // Enter.theValue("3"+faker.number().randomDigitNotZero()+faker.number().digits(9)).into(ADD_PATIENT_TELEPHONE),
                //Enter.theValue(faker.internet().emailAddress().replace(" ","_")).into(ADD_CONTACTUS_EMAIL),
                // Enter.theValue(String.valueOf(faker.number().randomDigitNotZero()+faker.number().numberBetween(100000,999999999))).into(ADD_PATIENT_IDENTIFICATION),


                Enter.theValue(lastNameDoctor).into(ADD_DOCTOR_LASTNAME),
                Enter.theValue(telephoneDoctor).into(ADD_DOCTOR_TELEPHONE),
                SelectFromOptions.byValue(VALUE_3).from(SELECTOR_INFORMATION),
                Enter.theValue(s).into(ADD_DOCTOR_ID),
                //     Enter.theValue(idDoctor).into(ADD_DOCTOR_ID),
                Click.on(BUTTON_SAVE_FINISH)
        );




    }

    public static PutDoctorInformation putInformation(Doctor doctor){
        return instrumented (PutDoctorInformation.class,doctor);
    }

}