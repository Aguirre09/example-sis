package co.com.testing.reto.dto.model;

public class Patient {
    private String namePatient;
    private String lastnamePatient;
    private String telephonePatient;
   // private String id;


    public Patient(String namePatient, String lastnamePatient, String telephonePatient) {
        this.namePatient = namePatient;
        this.lastnamePatient = lastnamePatient;
        this.telephonePatient = telephonePatient;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getLastnamePatient() {
        return lastnamePatient;
    }

    public void setLastnamePatient(String lastnamePatient) {
        this.lastnamePatient = lastnamePatient;
    }

    public String getTelephonePatient() {
        return telephonePatient;
    }

    public void setTelephonePatient(String telephonePatient) {
        this.telephonePatient = telephonePatient;
    }
}
