package co.com.testing.reto.dto.model;

public class Doctor {
        private String name;
        private String lastname;
        private String telephone;
        private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Doctor(String name, String lastname, String telephone) {
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
        //this.id = id;
    }
}
