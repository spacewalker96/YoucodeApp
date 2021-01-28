package org.example.test;

import org.example.DAOAdmin.DAO;
import org.example.DAOAdmin.DaoFormateur;
import org.example.DAOAdmin.DaoSecretaire;
import org.example.DAOAdmin.StudentDao;
import org.example.modele.Formateur;
import org.example.modele.Secretaire;
import org.example.modele.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

       // DAO dao = new StudentDao();

        DAO dao = new DaoFormateur();
        List<Formateur> formateurs = new ArrayList<Formateur>();
         formateurs = dao.getAll();

         for (Formateur formateur : formateurs){
             System.out.println(formateur);
             System.out.println("id = " + formateur.getId());
             System.out.println("Name = "+ formateur.getFormateur_firstname());
             System.out.println("Bien");

         }

     /*   DAO dao = new DaoSecretaire();
        List<Secretaire> secretaires = new ArrayList<Secretaire>();
        secretaires = dao.getAll();

        for (Secretaire secretaire : secretaires){
            System.out.println(secretaire);
            System.out.println("id = " + secretaire.getSecretaire_id());
            System.out.println("Name = "+ secretaire.getSecretaire_firstname());
            System.out.println("Bien");

        }*/





        //daoSecretaire.delete( 3);
                //daoStudent.delete(1);
        //System.out.println("bien delete !");

      //  List<Student> students = new ArrayList<Student>();
        //students = dao.getAll();


     /*   for (Student student : students) {
            System.out.println(student);
            System.out.println("id = " + student.getId());
            System.out.println("Name = "+ student.getFirst_name());
            System.out.println("Bien");
        }*/
    }
}
