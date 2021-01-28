package org.example.modele;

public class Formateur {
    private  int id;
    private  String formateur_firstname;
    private  String formateur_lastname;
    private  String formateur_email;

    private  String formateur_speciality;
    private  String password;
    private  String role_id;

////////////////constructor/////


    public Formateur() {
    }


    public Formateur(int id, String nom, String prenom, String email) {

        this.id = id;
        this.formateur_firstname=nom;
        this.formateur_lastname=prenom;
        this.formateur_email=email;


    }



    /////////////getter/////////

    public  int getId() {

        return id;
    }

    public  String getFormateur_firstname() {

        return formateur_firstname;
    }

    public  String getFormateur_lastname() {
        return formateur_lastname;
    }

    public  String getFormateur_speciality() {
        return formateur_speciality;
    }

    public  String getFormateur_email() {
        return formateur_email;
    }

    public  String getPassword() {
        return password;
    }

    public  String getRole_id() {
        return role_id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFormateur_firstname(String formateur_firstname) {
        this.formateur_firstname = formateur_firstname;
    }

    public void setFormateur_lastname(String formateur_lastname) {
        this.formateur_lastname = formateur_lastname;
    }

    public void setFormateur_email(String formateur_email) {
        this.formateur_email = formateur_email;
    }

    public void setFormateur_speciality(String formateur_speciality) {
        this.formateur_speciality = formateur_speciality;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }
}

