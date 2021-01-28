package org.example.modele;

public class Secretaire {

    private  int secretaire_id;
    private  String secretaire_firstname;
    private  String secretaire_lastname;
    private  String secretaire_email;
    private  String password;
    private  String role_id;


    public Secretaire() {

    }

    //Constructor


    public Secretaire(int id, String nom, String prenom, String email) {

        this.secretaire_id=id;
        this.secretaire_firstname=nom;
        this.secretaire_lastname=prenom;
        this.secretaire_email=email;


    }


    public int getSecretaire_id() {
        return secretaire_id;
    }

    public  String getSecretaire_firstname() {
        return secretaire_firstname;
    }

    public  String getSecretaire_lastname() {
        return secretaire_lastname;
    }

    public  String getSecretaire_email() {
        return secretaire_email;
    }

    public  String getPassword() {
        return password;
    }

    public  String getRole_id() {
        return role_id;
    }

    public void setSecretaire_id(int secretaire_id) {
        this.secretaire_id = secretaire_id;
    }

    public void setSecretaire_firstname(String secretaire_firstname) {
        this.secretaire_firstname = secretaire_firstname;
    }

    public void setSecretaire_lastname(String secretaire_lastname) {
        this.secretaire_lastname = secretaire_lastname;
    }

    public void setSecretaire_email(String secretaire_email) {
        this.secretaire_email = secretaire_email;
    }
}

