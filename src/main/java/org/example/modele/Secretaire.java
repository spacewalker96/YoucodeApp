package org.example.modele;

public class Secretaire {

    private static int secretaire_id;
    private static String secretaire_firstname;
    private static String secretaire_lastname;
    private static String secretaire_email;
    private static String password;
    private static String role_id;


    public Secretaire() {

    }


    public Secretaire(int sectretaire_id, String secretaire_firstname, String secretaire_lastname, String secretaire_email) {

    }


    public static int getSecretaire_id() {
        return secretaire_id;
    }

    public static String getSecretaire_firstname() {
        return secretaire_firstname;
    }

    public static String getSecretaire_lastname() {
        return secretaire_lastname;
    }

    public static String getSecretaire_email() {
        return secretaire_email;
    }

    public static String getPassword() {
        return password;
    }

    public static String getRole_id() {
        return role_id;
    }
}
