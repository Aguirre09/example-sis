package co.com.testing.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddDoctorPage {
    public static final Target ADD_DOCTOR_NAME = Target.the("DOCTOR'S Name")
            .located(By.id("name"));

    public static final Target ADD_DOCTOR_LASTNAME= Target.the("DOCTOR'S Lastname")
            .located(By.id("last_name"));

    public static final Target ADD_DOCTOR_TELEPHONE= Target.the("DOCTOR'S Telephone")
            .located(By.id("telephone"));

    public static  final  Target ADD_DOCTOR_ID = Target.the("Doctor's Id")
            .located(By.id("identification"));

    public static final Target BUTTON_SAVE_FINISH = Target.the("DOCTOR'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Guardar')]"));

    public static final Target SELECTOR_INFORMATION = Target.the("Select Options")
            .located(By.id("identification_type"));

    public static final Target MESSAGE_CREATED = Target.the("DOCTOR CREATED")
            .located(By.xpath("//*[contains(text(),'Datos guardados correctamente.')]"));

    public static final Target MESSAGE_CREATED_ERROR = Target.the("DOCTOR CREATED WITH ERROR")
            .located(By.xpath("//*[contains(text(),'El campo 'Documento de identidad' ya esta registrado.')]"));


}
