package co.com.testing.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPatientPage {
    public static final Target ADD_PATIENT_NAME = Target.the("Patient's Name")
            .located(By.xpath("//input[@name='name']"));

    public static final Target ADD_PATIENT_LASTNAME= Target.the("Patient's Lastname")
            .located(By.xpath("//input[@name='last_name']"));

    public static final Target ADD_PATIENT_TELEPHONE= Target.the("Patient's telephone")
            .located(By.xpath("//input[@name='telephone']"));

    public static  final  Target ADD_PATIENT_ID = Target.the("Patient's Id")
            .located(By.xpath("//input[@name='identification']"));

    public static final Target SELECTOR_INFORMATION_PATIENT = Target.the("Select Options for Patient")
            .located(By.xpath("//select[@name='identification_type']"));

    public static final Target PREPAID_PAGE_PATIENT = Target.the("Button where users can select prepaid")
            .located(By.xpath("//input[@name='prepaid']"));

    public static final Target DASHBOARD_SUCCESFULLY = Target.the("Dashboard  of the patient page")
            .located(By.xpath("//*[contains(text(),'Guardado:')]"));

}
