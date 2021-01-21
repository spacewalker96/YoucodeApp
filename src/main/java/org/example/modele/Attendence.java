package org.example.modele;

import java.sql.Date;

public class Attendence {
    private static Long id;
    private static Date date;
    private static  int absence_justif;
    private static  int absence_non_justif;
    private static Long id_student;
    public Attendence(){

    }
    public Attendence(int A_j,int A_N_j){
        Attendence.absence_justif=A_j;
        Attendence.absence_non_justif=A_N_j;
    }
    public Attendence(Long id, Date date, Long id_student) {
        this.id=id;
        this.date=date;
        this.id_student=id_student;

    }

    public static int getAbsence_justif() {
        return absence_justif;
    }

    public static void setAbsence_justif(int absence_justif) {
        Attendence.absence_justif = absence_justif;
    }

    public static int getAbsence_non_justif() {
        return absence_non_justif;
    }

    public static void setAbsence_non_justif(int absence_non_justif) {
        Attendence.absence_non_justif = absence_non_justif;
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



    public static Long getId_student() {
        return id_student;
    }

    public static void setId_student(Long id_student) {
        Attendence.id_student = id_student;
    }
}
