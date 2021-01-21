package org.example.modele;

import java.sql.Date;

public class Attendence {
    private static Long id;
    private static Date date;
    private static  String justif;
    private static Long id_student;

    public Attendence(Long id, Date date, Long id_student) {
        this.id=id;
        this.date=date;
        this.id_student=id_student;

    }

    public static Long getId() {
        return id;
    }

    public static void setId(Long id) {
        Attendence.id = id;
    }

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        Attendence.date = date;
    }

    public static String getJustif() {
        return justif;
    }

    public static void setJustif(String justif) {
        Attendence.justif = justif;
    }

    public static Long getId_student() {
        return id_student;
    }

    public static void setId_student(Long id_student) {
        Attendence.id_student = id_student;
    }
}
