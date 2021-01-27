package org.example.modele;

public class Student {
    private static int student_id;
    private static String student_firstname;
    private static String student_lastname;
    private static String student_email;
    private static String student_password;
    private static String student_annescolaire;
    private static int id_role;
    private static int id_specialite;
    private static int student_presence;
    private static int student_absence;

    //Constructor
    public Student() {
        super();
    }

    public Student(int student_id, String student_firstname, String student_lastname, String student_email, String student_password, String student_annescolaire, int id_role, int id_specialite, int student_presence, int student_absence) {
        this.student_id = student_id;
        this.student_firstname = student_firstname;
        this.student_lastname = student_lastname;
        this.student_email = student_email;
        this.student_password = student_password;
        this.student_annescolaire = student_annescolaire;
        this.id_role = id_role;
        this.id_specialite = id_specialite;
        this.student_presence = student_presence;
        this.student_absence = student_absence;
    }

    //Getters && Setters

    public static int getStudent_id() {
        return student_id;
    }

    public static String getStudent_firstname() {
        return student_firstname;
    }

    public static String getStudent_lastname() {
        return student_lastname;
    }

    public static String getStudent_email() {
        return student_email;
    }

    public static String getStudent_password() {
        return student_password;
    }

    public static String getStudent_annescolaire() {
        return student_annescolaire;
    }

    public static int getId_role() {
        return id_role;
    }

    public static int getId_specialite() {
        return id_specialite;
    }

    public static int getStudent_presence() {
        return student_presence;
    }

    public static int getStudent_absence() {
        return student_absence;
    }

    public static void setStudent_id(int student_id) {
        Student.student_id = student_id;
    }

    public static void setStudent_firstname(String student_firstname) {
        Student.student_firstname = student_firstname;
    }

    public static void setStudent_lastname(String student_lastname) {
        Student.student_lastname = student_lastname;
    }

    public static void setStudent_email(String student_email) {
        Student.student_email = student_email;
    }

    public static void setStudent_password(String student_password) {
        Student.student_password = student_password;
    }

    public static void setStudent_annescolaire(String student_annescolaire) {
        Student.student_annescolaire = student_annescolaire;
    }

    public static void setId_role(int id_role) {
        Student.id_role = id_role;
    }

    public static void setId_specialite(int id_specialite) {
        Student.id_specialite = id_specialite;
    }

    public static void setStudent_presence(int student_presence) {
        Student.student_presence = student_presence;
    }

    public static void setStudent_absence(int student_absence) {
        Student.student_absence = student_absence;
    }
}