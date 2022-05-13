package co.com.testing.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPage {
    public static final Target BUTTON_DOCTOR_INDEX = Target.the("DOCTOR'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Agregar Doctor')]"));
    public static final Target BUTTON_PATIENT_INDEX = Target.the("PATIENT'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Agregar Paciente')]"));

}
