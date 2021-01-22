package org.example.modele;

public class Formateur {
    private static int id;
    private static String formateur_firstname;
    private static String formateur_lastname;
    private static String formateur_speciality;
    private static String formateur_email;
    private static String password;
    private static String role_id;

////////////////constructor/////

    public Formateur() {
    }

    public Formateur(int formateur_id, String formateur_firstname, String formateur_lastname, String formateur_email) {

    }

    /////////////getter/////////

    public static int getId() {

        return id;
    }

    public static String getFormateur_firstname() {

        return formateur_firstname;
    }

    public static String getFormateur_lastname() {
        return formateur_lastname;
    }

    public static String getFormateur_speciality() {
        return formateur_speciality;
    }

    public static String getFormateur_email() {
        return formateur_email;
    }

    public static String getPassword() {
        return password;
    }

    public static String getRole_id() {
        return role_id;
    }
}
