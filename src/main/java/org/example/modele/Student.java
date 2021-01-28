package org.example.modele;

public class Student {
    private int id;
    private String first_name;
    private String last_name;
    private String speciality;
    private String email;
    private  String password;
    private String annesScolaire;
    private  int presence;
    private int absence;
    private String role;

    //Constructor
    public Student() {

    }
    //Constructor
    public Student(int id, String nom, String prenom, String email) {
        super();
        this.id = id;
        this.first_name = nom;
        this.last_name = prenom;
        this.email = email;
    }




    public Student(int id,String first_name,String last_name,String email,String password,String speciality,String annesScolaire,String role){
        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.password=password;
        this.speciality=speciality;
        this.annesScolaire=annesScolaire;
        this.role=role;
    }

    //Getters && Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {

       this.id = id;
    }

    public String getFirst_name() {

        return first_name;
    }

    public void setFirst_name(String first_name) {

        this.first_name = first_name;
    }

    public String getLast_name() {

        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAnnesScolaire() {
        return annesScolaire;
    }

    public void setAnnesScolaire(String annesScolaire) {
        this.annesScolaire = annesScolaire;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
